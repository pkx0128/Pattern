package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:23 下午
 */

/**
 * 接口Button的具体实现类
 */
public class SpringButton implements Button {

    @Override
    public void display(){
        System.out.println("显示绿色按钮");
    }
}
