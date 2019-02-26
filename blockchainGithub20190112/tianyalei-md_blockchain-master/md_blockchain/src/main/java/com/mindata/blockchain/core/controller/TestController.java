package com.mindata.blockchain.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Ldm
 * @Date: 2019/1/17 12:01
 */
@Controller
@RequestMapping("/b")

public class TestController {

    /***
     * hello  展示
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    private String test(){

        return "index";
    }

}
