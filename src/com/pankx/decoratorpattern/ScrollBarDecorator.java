package com.pankx.decoratorpattern;

/**
 * @author pankx
 * @date 2021/1/22 11:45 上午
 */

/**
 * 抽象装饰类的具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("添加滚动条");
    }

}
