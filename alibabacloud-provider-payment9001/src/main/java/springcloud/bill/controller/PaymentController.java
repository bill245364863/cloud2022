package springcloud.bill.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/mgs")
    public String message(){
        System.out.println("bill");
        return "my name is bill ,i at in " + port;
    }
}
