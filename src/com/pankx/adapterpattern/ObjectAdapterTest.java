package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/20 12:00 上午
 */

/**
 * 由于添加了适配器类适配了目标类与适配者类的相关方法从而实现了直接通过目标类中方法调用适配者类中的方法
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        WeChat weChat = new WeChat();
        ObjectAdapterTarget objectAdapterTarget = new ObjectAdapter(weChat);
        objectAdapterTarget.chat();
    }
}
