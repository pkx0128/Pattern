package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:58 下午
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
//        SkinFactory factory = new SummerSkinFactory(); //可通过外部配置文件获取此类从而起到不修改现有代码做到改变其他对象
        SkinFactory factory = (SkinFactory)GetSkinFactoryForXml.getFactory();
        System.out.println(factory);
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();
    }
}
