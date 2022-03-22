package com.bill.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: MyRobinRule
 * @Author huangxiaotao
 * @Date:2022 02 2022/2/22 22:18
 * @Version 1.0
 * 这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
 *
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。
 */
@Configuration
public class MyRobinRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
