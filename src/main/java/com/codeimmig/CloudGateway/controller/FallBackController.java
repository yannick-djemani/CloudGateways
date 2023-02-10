package com.codeimmig.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallback(){
        return "Order service is down!! ";
    }

    @GetMapping("/paymentServiceFallback")
    public String paymentServiceFallback(){
        return "Payment service is down!! ";
    }

    @GetMapping("/productServiceFallBack")
    public String oderServiceFallback(){
        return "Product service is down!! ";
    }
}
