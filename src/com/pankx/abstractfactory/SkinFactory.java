package com.pankx.abstractfactory;

/**
 * @author pankx
 * @date 2020/12/9 11:35 下午
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
