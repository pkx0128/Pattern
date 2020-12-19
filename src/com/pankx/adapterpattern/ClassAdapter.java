package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/19 11:35 下午
 */

/**
 * 类适配器模式中的适配器类：要继承适配者类并同时实现目标类接口
 */
public class ClassAdapter extends Users implements ClassAdapterTarget {
    @Override
    public void getUsersName() {
        super.getName();//调用父类Users中的getName方法从而实现通过目标类要调用适配者类(Users)中的方法
    }
}
