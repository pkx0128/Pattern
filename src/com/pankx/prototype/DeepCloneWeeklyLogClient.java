package com.pankx.prototype;

import java.io.IOException;

/**
 * @author pankx
 * @date 2020/12/17 12:59 下午
 */
public class DeepCloneWeeklyLogClient {
    public static void main(String[] args) {
        DeepCloneWeeklyLog cloneWeeklyLog = null;
        //创建原型对象
        DeepCloneWeeklyLog deepCloneWeeklyLog = new DeepCloneWeeklyLog();
        DeepCloneAttachment deepCloneAttachment = new DeepCloneAttachment();
        deepCloneWeeklyLog.setAttachment(deepCloneAttachment);
        try {
            //实现克隆
            cloneWeeklyLog = deepCloneWeeklyLog.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(deepCloneWeeklyLog == cloneWeeklyLog);//输出flase
        System.out.println(deepCloneWeeklyLog.getAttachment() == cloneWeeklyLog.getAttachment());//输出flase
    }
}
