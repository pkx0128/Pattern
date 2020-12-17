package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 7:02 下午
 */

/**
 * 具体原型类
 */
public class PrototypeDemoB extends PrototypeDemo {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public PrototypeDemo clone() {
         PrototypeDemoB prototypeDemob = new PrototypeDemoB();
         prototypeDemob.setAge(this.age);
         return prototypeDemob;
    }


}
