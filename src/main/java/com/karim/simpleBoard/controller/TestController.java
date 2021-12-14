package com.karim.simpleBoard.controller;

import com.karim.simpleBoard.service.TestService;
import com.karim.simpleBoard.vo.TestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by sblim
 * Date : 2021-12-14
 * Time : 오전 10:31
 */
@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/")
    public String test() {
        List<TestVo> list = testService.getAllUserList();
        System.out.println(list);
        return "test";
    }

    @GetMapping("/hello")
    public String hello(String name) {
        //http://localhost:8080/hello?name=subin
        return "Hello World! = " + name;
    }
}
