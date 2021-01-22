package com.pankx.decoratorpattern;

/**
 * @author pankx
 * @date 2021/1/22 11:13 上午
 */

/**
 * 抽象构件类Component的具体实现类
 */
public class TextBox extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
