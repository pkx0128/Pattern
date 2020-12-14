package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:32 下午
 */

/**
 * 接口TextField的具体实现类
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色文本框");
    }
}
