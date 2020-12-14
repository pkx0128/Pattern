package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:33 下午
 */

/**
 * 接口ComboBox的具体实现类
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色复选框");
    }
}
