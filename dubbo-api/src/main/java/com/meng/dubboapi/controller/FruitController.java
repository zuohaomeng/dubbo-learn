package com.meng.dubboapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author ZuoHao
 * @Date 2020/10/17 13:49
 */
@RequestMapping("/fruit")
@RestController
public class FruitController {

    @GetMapping("/buy")
    public Object buy(){
        return "buy an apple";
    }
}
