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
    /**
     * 代码中注入RouteLocator的Bean
     * @Bean
     * public RouteLocator myRoutes(RouteLocatorBuilder builder) {
     *     return builder.routes()
     *         .route(p -> p
     *             .path("/get")
     *             .filters(f -> f.addRequestHeader("Hello", "World"))
     *             .uri("http://httpbin.org:80"))
     *         .route(p -> p
     *             .host("*.circuitbreaker.com")
     *             .filters(f -> f.circuitBreaker(config -> config.setName("mycmd")))
     *             .uri("http://httpbin.org:80")).
     *         build();
     * }
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //注册id，路由路径，uri跳转路径 在不变更路径的前提下
        routes.route("path_route_bill", r -> r.path("/baidu").uri("https://blog.csdn.net/u011863024/article/details/114298282"));
        return routes.build();

    }
}
