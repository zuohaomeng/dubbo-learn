package com.meng.dubboapi.dubbo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.compiler.Compiler;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Protocol;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author ZuoHao
 * @Date 2020/10/17 13:56
 */
public class Control {
    public static void main(String[] args) {
//        getMyRobot();
//        getAdaptiveCompiler();
        getAdaptiveProtocol();
        getCache();
    }

    private static void getMyRobot() {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }


    private static void getAdaptiveCompiler(){
        Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getAdaptiveExtension();
        System.out.println(compiler);
    }
    private static void getAdaptiveProtocol(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(protocol);
    }

    /**
     * 获取激活扩展点
     */
    private static void getCache(){
        URL url = new URL("","",111);
        url = url.addParameter("cache", "cache");
        List<Filter> filters = ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtension(url,"cache");
        System.out.println(Arrays.toString(filters.toArray()));
    }
}
