package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/15 2:01 下午
 */

/**
 *原型模式的通过实现实例
 *
 * 原型模式的抽象原型
 */
public abstract class AbstractPrototype {
    /**
     * 原型对象的克隆方法
     * @return AbstractPrototype对象
     */
    public abstract AbstractPrototype clone();
}

/**
 * 原型模式抽象类原型的实现类
 */
class AbstractPrototypeimpl extends AbstractPrototype {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AbstractPrototype clone() {
        AbstractPrototypeimpl abstractPrototype = new AbstractPrototypeimpl();
        abstractPrototype.setName(this.name);
        return abstractPrototype;
    }
}

/**
 * 原型模式测试
 */
class PrototypeTest {
    public static void main(String[] args) {
        //创建对象原型
        AbstractPrototypeimpl abstractPrototypeimpl = new AbstractPrototypeimpl();
        System.out.println(abstractPrototypeimpl);
        //使用原对象的clone方法实现对象克隆
        AbstractPrototypeimpl abstractPrototype = (AbstractPrototypeimpl) abstractPrototypeimpl.clone();
        System.out.println(abstractPrototype);
    }
}