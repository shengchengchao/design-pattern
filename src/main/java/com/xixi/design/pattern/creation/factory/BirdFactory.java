package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class BirdFactory extends AbstractFactory {
    @Override
    public Bird getBird(String name) {
        if("penguin".equals(name)){
            return new Penguin();
        }else if("swallow".equals(name)){
            return new Swallow();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
