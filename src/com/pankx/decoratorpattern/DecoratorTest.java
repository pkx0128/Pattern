package com.pankx.decoratorpattern;

/**
 * @author pankx
 * @date 2021/1/22 12:01 下午
 */

/**
 * 测试装饰模式
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component window =new Window();//创建原窗口对象
        window.display();//显示原窗口对象

        ComponentDecorator dwindow = new ScrollBarDecorator(window);//创建带滚动条的窗口对象，为装饰后的window对象
        dwindow.display();//显示的为装饰后的window对象

        ComponentDecorator bdwindow = new BlackBorderDecorator(dwindow);//创建带滚动条的窗口对象，为装饰后的window对象
        bdwindow.display();
    }
}
