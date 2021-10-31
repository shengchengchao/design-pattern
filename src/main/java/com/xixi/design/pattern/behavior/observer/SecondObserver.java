package com.xixi.design.pattern.behavior.observer;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class SecondObserver implements Observer  {
    @Override
    public void send() {
        System.out.println("第二次接收");
    }
}
