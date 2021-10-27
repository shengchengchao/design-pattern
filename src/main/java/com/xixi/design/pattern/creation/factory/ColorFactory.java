package com.xixi.design.pattern.creation.factory;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Bird getBird(String name) {

        return null;
    }

    @Override
    public Color getColor(String color) {
        if("green".equals(color)){
            return new GreenColor();
        }else if("red".equals(color)){
            return new RedColor();
        }
        return null;
    }
}
