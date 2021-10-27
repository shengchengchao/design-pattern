package com.xixi.design.pattern.structural.decorator;

/**
 * 装饰模式 有点代理的味道，更多的对于已有逻辑的一个增强处理
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        CustomizeBirdDecorator customizeBirdDecorator = new CustomizeBirdDecorator(penguin);
        customizeBirdDecorator.fly();
    }
}
