package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */


@Controller

// /home/* 으로 오는 request는 App 클래스로 연결한다.
@RequestMapping("/home/*")
public class App 
{

    // "/home/test"로 연결된 요청은 response 의 body에 "Spring + Maven"이라는 문자열을 반환한다.
    @GetMapping("test")
    public @ResponseBody String homeTest(){
        return "Spring + Maven";
    }
}
