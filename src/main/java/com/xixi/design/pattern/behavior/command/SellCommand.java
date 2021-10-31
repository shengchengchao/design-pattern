package com.xixi.design.pattern.behavior.command;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class SellCommand implements Order {

    private Person person;

    public SellCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        person.sell();
    }
}
