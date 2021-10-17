package com.coooldoggy.book.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController: JSON을 반환하는 컨트롤러
 */
@RestController
public class HelloController {

    /**
     * @GetMapping : HTTP Method GET 요청을 받을 수 있는 API를 만들어줌
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
