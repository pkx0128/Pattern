package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:30 下午
 */

/**
 * 接口Button接口的具体实现类
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示蓝色按钮");
    }
}
