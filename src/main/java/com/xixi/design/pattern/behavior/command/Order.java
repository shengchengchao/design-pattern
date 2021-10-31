package com.xixi.design.pattern.behavior.command;

/** 行为请求者与行为实现者通常是一种紧耦合的关系，这样就可以将实现者作为一个参数来进行处理 ，
 *  但是其实在spring  给出的IOC中 使得每一个类都可以当成一个静态类去进行处理，
 *  命令模式 主要的是解耦， 命令模式看着是在将 命令的请求者中对于耦合进行了减少，
 *  但是 使用了一个中间类的方式 能够实现多态的处理，我直接让行为请求者传入参数为接口类，根据实际传入的对象来实现多态的处理。
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public interface Order {

    void execute();
}
