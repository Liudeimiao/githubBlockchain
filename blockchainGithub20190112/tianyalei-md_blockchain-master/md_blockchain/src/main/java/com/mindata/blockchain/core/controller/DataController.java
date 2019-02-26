package com.mindata.blockchain.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Ldm
 * @Date: 2019/1/17 14:15
 */
@Controller
@RequestMapping("/data")
public class DataController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /***
     * 数据展示
     * @return
     */
    @RequestMapping(value = "/data-tables", method = RequestMethod.GET)
    private String dataTables(){
        logger.info("进入data-tables....数据处理和加载");


        return "data-tables";
    }
}
