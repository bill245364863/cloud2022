package com.bill.springcloud.Controller;

import com.netflix.ribbon.proxy.annotation.ResourceGroup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: ClientController
 * @Author huangxiaotao
 * @Date:2022 03 2022/3/30 21:40
 * @Version 1.0
 */
@RestController
@RefreshScope  //手动刷新 curl -X POST "http://localhost:3355/actuator/refresh" 通知client更新
public class ClientController {
    @Value("${config.info}")
    private String configInfo;

    @Value("${config.name}")
    private String configName;

    /**
     * bootstrap 会先会config的配置进行整合之后再整合自己的application配置文件，如果有重复则以bootstrap+config application中的数据为主
     * @return
     */
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configName + configInfo;
    }
}
