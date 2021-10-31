package com.xixi.design.pattern.behavior.command;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class BuyCommand implements Order {

    private Person person;

    public BuyCommand(Person person) {
        this.person = person;
    }

    @Override
    public void execute() {
        person.buy();
        
    }


}
