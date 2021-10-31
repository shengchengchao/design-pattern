package com.xixi.design.pattern.behavior.state;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class NoMoneyState extends State {


    private Machine machine;

    public NoMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void add() {
        System.out.println("加1");
        machine.setState(machine.moneyState);
    }

    @Override
    public void sub() {
        System.out.println("没有钱了");

    }
}
