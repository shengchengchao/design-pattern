package com.xixi.design.pattern.behavior.responsibilitychannel;

/**
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/27
 */
public abstract class ApproveNode  {

    protected String role;

    public ApproveNode subordinate;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ApproveNode getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(ApproveNode subordinate) {
        this.subordinate = subordinate;
    }

    public abstract void approve();

}
