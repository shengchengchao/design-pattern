package com.xixi.design.pattern.structural.adapter;

/**  说白了 适配器模式 就是采用了组合的方式 对于老接口做了一个适配。
 * @author shengchengchao
 * @Description
 * @createTime 2021/10/25
 */
public interface MediaPlayer {


    void playMedia(String type,String filename);
}
