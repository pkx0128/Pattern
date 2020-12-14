package com.pankx.simpleFactory;

/**
 * 工厂类
 */
public class Factory {
    /**
     * 获取工厂返回的对象
     * @param name 产品对象的名称
     * @return 根据传的产品对象名称返回相应的对象
     */
    public static Person getPersonObject(String name){
        Person person = null;
        if(name.equalsIgnoreCase("student")){
            person = new Student();
        }else if(name.equalsIgnoreCase("teacher")){
            person = new Teacher();
        }
        return person;
    }
}
