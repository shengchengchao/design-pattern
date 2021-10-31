package com.xixi.design.pattern.behavior.agent;

/**  中介模式 暂时不知道有什么用
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public class AgentDemo {


    public static void main(String[] args) {
        User user = new User("王", "11");
        Agent.agentTest(user);
    }
}
