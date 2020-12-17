package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 6:54 下午
 */

/**
 * 具体原型类
 */
public class PrototypeDemoA extends PrototypeDemo{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeDemo clone() {
        PrototypeDemoA prototypeDemo = new PrototypeDemoA();
        prototypeDemo.setName(this.name);
        return prototypeDemo;
    }
}
