package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 12:56 上午
 */

/**
 * 测试WeeklyLog实现的原型模式
 */
public class WeeklyLogClient {
    public static void main(String[] args) {
        //创建附件对象
        Attachment attachment = new Attachment();
        //创建原型对象
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setAttachment(attachment);
        //克隆原型对象
        WeeklyLog weeklyLog1Clone = weeklyLog.clone();

        System.out.println(weeklyLog == weeklyLog1Clone);//执行clone方法后生成新对象所以两个对象不相同故返回fase
        System.out.println(weeklyLog.getAttachment() == weeklyLog1Clone.getAttachment());//浅克隆中引用类型成员不被复制，复制的是内存地址故返回true
    }
}
