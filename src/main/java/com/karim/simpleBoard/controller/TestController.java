package com.karim.simpleBoard.controller;

import ch.qos.logback.classic.Logger;
import com.karim.simpleBoard.service.TestService;
import com.karim.simpleBoard.vo.TestVo;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    private final ch.qos.logback.classic.Logger logger = (Logger) LoggerFactory.getLogger(TestController.class);

    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        List<TestVo> list = testService.getAllUserList();
        System.out.println(list);
        logger.info("{} => {}", "list", list);
        return "test";
    }

    @GetMapping("/hello")
    public String hello(String name, Model model) {
        //http://localhost:8080/hello?name=karim
        model.addAttribute("name", name);
        logger.info("{} => {}", "name", name);
        //html 이름
        return "hello";
    }
}
