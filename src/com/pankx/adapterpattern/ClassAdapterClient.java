package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/19 11:34 下午
 */

/**
 * 由于添加了适配器类适配了目标类与适配者类的相关方法从而实现了直接通过目标类中方法调用适配者类中的方法
 */
public class ClassAdapterClient {
    public static void main(String[] args) {
        //创建目标类对象
        ClassAdapterTarget adapter = new ClassAdapter();
        adapter.getUsersName();//通过目标类对象调用适配者的方法
    }
}
