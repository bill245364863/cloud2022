package com.bill.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @title: MyLogGateWayFilter
 * @Author huangxiaotao
 * @Date:2022 03 2022/3/29 21:20
 * @Version 1.0
 *     implements GlobalFilter, Ordered
 *     http://localhost:9527/payment/get/2?uname=bill
 *     将该对象注入到容器中
 */
@Configuration
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    /**
     * 实现连个接口 全局过滤，还有order
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info(" COME IN MyLogGateWayFilter {}",new Date());
        //获取请求中的数据 进行数据处理
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (StringUtils.isBlank(uname)) {
            log.info("uname not  be entry!");
            //设置状态码  HttpStatus
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            //完成返回
            return exchange.getResponse().setComplete();
        }
        //过滤链放行 进行下一个过滤链
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
