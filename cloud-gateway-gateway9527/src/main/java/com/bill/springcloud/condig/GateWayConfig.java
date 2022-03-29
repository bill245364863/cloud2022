package com.bill.springcloud.condig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: GateWayConfig
 * @Author huangxiaotao
 * @Date:2022 03 2022/3/27 21:10
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_bill", r -> r.path("/baidu").uri("https://www.bilibili.com/video/BV18E411x7eT?p=70&spm_id_from=pageDriver"));
        return routes.build();

    }
}
