package com.xixi.design.pattern.behavior.state;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/31
 */
public class Machine {
    NoMoneyState noMoneyState =new NoMoneyState(this);
    MoneyState moneyState =new MoneyState(this);


    private State state=moneyState;

    public void setState(State state) {
        this.state = state;
    }


    public void add() {
        state.add();
    }


    public void sub() {
       state.sub();
    }


    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.sub();
        machine.sub();
    }
}
