package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class StaticFactory {


    public Bird getBird(String name){
        if("penguin".equals(name)){
            return new Penguin();
        }else if("swallow".equals(name)){
            return new Swallow();
        }
        return null;
    }


    public static void main(String[] args) {
        StaticFactory staticFactory = new StaticFactory();
        Bird penguin = staticFactory.getBird("penguin");
        penguin.fly();
    }
}
