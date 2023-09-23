package jp.co.mforce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getDemo")
    public String hello(){
        return "call DemoController";
    }
}