package com.mindata.blockchain.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Ldm
 * @Date: 2019/1/16 13:52
 */
@Controller
public class ContentController {

    /***
     * hello  展示
     * @return
     */
    @GetMapping("/hello")
    private String hello(){

        return "hello";
    }


    /***
     * 首页 展示
     * @return
     */
    @GetMapping("/index")
    private String index(){

        return "/index";
    }

    /***
     * 首页 展示
     * @return
     */
    @GetMapping("/login")
    private String login(){

        return "login";
    }







}
