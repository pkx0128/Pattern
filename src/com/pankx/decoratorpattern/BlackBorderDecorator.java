package com.pankx.decoratorpattern;

/**
 * @author pankx
 * @date 2021/1/22 11:58 上午
 */
/**
 * 抽象装饰类的具体装饰类
 */

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        this.setBlackBorder();
    }

    public void setBlackBorder(){
        System.out.println("添加黑色边框");
    }
}
