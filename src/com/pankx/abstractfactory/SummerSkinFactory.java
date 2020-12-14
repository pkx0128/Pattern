package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:53 下午
 */

/**
 * 接口SkinFactory接口的具体实现类
 */
public class SummerSkinFactory  implements SkinFactory{
    /**
     * 创建SummerButton对象
     * @return SummerButton对象
     */
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    /**
     * 创建SummerTextField对象
     * @return SummerTextField对象
     */
    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    /**
     * 创建SummerComboBox对象
     * @return SummerComboBox对象
     */
    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
