package com.alibaba.dubbo.demo.impl;

/**
 * Created by daijitao on 2018/6/1.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
public class Provider {
    public static void main(String[] args) throws IOException {
        // ApplicationContext  context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}