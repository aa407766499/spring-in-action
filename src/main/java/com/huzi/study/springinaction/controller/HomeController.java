package com.huzi.study.springinaction.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Huzi114
 * @ClassName: HomeController
 * @Description:
 * @date 2020/7/22 21:19
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
