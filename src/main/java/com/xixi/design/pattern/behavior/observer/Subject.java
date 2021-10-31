package com.xixi.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public  class Subject {

    Integer status=0;

    List<Observer> list = new ArrayList<>();


    public void add(Observer observer){
        list.add(observer);
    }

    public void setStatus(Integer status) {
        this.status = status;
        notifyObserver();
    }

    public void notifyObserver(){
        for (Observer observer : list) {
            observer.send();
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        SecondObserver secondObserver = new SecondObserver();
        FirstObserver firstObserver =new FirstObserver();
        subject.add(secondObserver);
        subject.add(firstObserver);
        subject.setStatus(1);
    }
}
