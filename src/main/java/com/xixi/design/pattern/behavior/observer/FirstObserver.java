package com.xixi.design.pattern.behavior.observer;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class FirstObserver implements Observer {
    @Override
    public void send() {
        System.out.println("第一次接收成功");
    }
}
