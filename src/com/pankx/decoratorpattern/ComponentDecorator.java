package com.pankx.decoratorpattern;

/**
 * @author pankx
 * @date 2021/1/22 11:40 上午
 */

/**
 * 抽象装饰类
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
    /**
     * 定义抽象业务方法
     */
    @Override
    public void display() {
        component.display();
    }
}
