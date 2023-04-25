package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-04-21-[上午 11:13]-周五
 */
@Controller
public class UserController {

    @RequestMapping("/save")
    public void save() {
        System.out.println("User save ...");
    }
}
