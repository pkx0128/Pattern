package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:48 下午
 */

/**
 * 接口SkinFactory接口的具体实现类
 */
public class SpringSkinFactory implements SkinFactory {
    /**
     * 创建SpringButton对象
     * @return SpringButton对象
     */
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    /**
     * 创建SpringTextField对象
     * @return SpringTextField对象
     */
    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    /**
     * 创建SpringComboBox对象
     * @return SpringComboBox对象
     */
    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
