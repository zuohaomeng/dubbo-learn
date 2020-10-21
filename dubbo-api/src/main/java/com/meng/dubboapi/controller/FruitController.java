package com.meng.dubboapi.controller;

import com.meng.dubbointerface.service.FruitService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author ZuoHao
 * @Date 2020/10/17 13:49
 */

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Reference
    private FruitService fruitService;
    @GetMapping("/buy")
    public Object buy() {
        fruitService.buy();
        return "buy an apple";
    }
}
