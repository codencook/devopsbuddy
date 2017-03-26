package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aniket on 3/25/2017.
 */
@Controller
public class IndexController
{
    @RequestMapping("/")
    public String sayHello()
    {
        return "index";
    }
}
