package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:28 下午
 */

/**
 * 接口ComboBox接口的具体实现类
 */
public class SpringComboBox implements ComboBox {

    @Override
    public void display(){
        System.out.println("显示绿色复选框");
    }
}
