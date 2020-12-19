package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/19 11:34 下午
 */
public class ClassAdapterClient {
    public static void main(String[] args) {
        //创建适配器类对象
        ClassAdapter adapter = new ClassAdapter();
        adapter.getUsersName();//通过适配器对象间接调用了适配者的方法
    }
}
