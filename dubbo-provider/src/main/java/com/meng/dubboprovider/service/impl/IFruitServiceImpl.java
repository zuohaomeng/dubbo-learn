package com.meng.dubboprovider.service.impl;

import com.meng.dubbointerface.service.FruitService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description
 * @Author ZuoHao
 * @Date 2020/10/17 13:46
 */
@Service
public class IFruitServiceImpl implements FruitService {
    @Override
    public void buy() {
        System.out.println("购买水果");
    }
}
