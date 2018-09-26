package com.wp.testspringbootbyatuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 我的第一个SpringBoot程序
 * 其中 @RestController 等同于 （@Controller 与 @ResponseBody）
 *
 * @author wp
 */
@RestController
@SpringBootApplication
public class TestspringbootbyatuoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringbootbyatuoApplication.class, args);
        System.out.println("这是我的第一个SpringBoot程序");
    }

    @GetMapping("/demo1")
    private String demo1(){
        return "Hello world";
    }




}
