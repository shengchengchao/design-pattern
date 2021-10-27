package com.xixi.design.pattern.structural.combination;

import java.util.List;

/**
 * 构建一个类似于树的结构里完成代码的处理  不怎么用到 业务代码处理的时候 直接使用递归来解决
 * 重要的是 应该是对应的结构
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/26
 */
public class Employ {



    private String name;

    private String deptName;

    private Integer salary;

    private List<Employ> subordinate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employ(String name, String deptName, Integer salary) {
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

    public List<Employ> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<Employ> subordinate) {
        this.subordinate = subordinate;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
