package com.xixi.design.pattern.behavior.state;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class MoneyState extends State  {

    private Machine machine;

    public MoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void add() {
        System.out.println("加钱");

    }

    @Override
    public void sub() {
        System.out.println("减钱");
        machine.setState(machine.noMoneyState);
    }
}
