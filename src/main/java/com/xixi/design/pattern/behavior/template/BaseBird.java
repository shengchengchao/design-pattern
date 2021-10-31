package com.xixi.design.pattern.behavior.template;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public abstract class BaseBird {

    public void fly(){
        System.out.println("开始飞行");
        flyEnd();
    }

    protected abstract void flyEnd();
}
