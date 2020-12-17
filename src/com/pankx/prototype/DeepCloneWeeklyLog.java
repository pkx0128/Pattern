package com.pankx.prototype;

/**
 * @author pankx
 * @date 2020/12/17 12:38 下午
 */

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 *可通过序列化与反序列化要实现深度克隆
 */
public class DeepCloneWeeklyLog implements Serializable {//实现序列化接口Serializable
    private DeepCloneAttachment attachment;
    private String name;
    private String date;
    private String content;

    public DeepCloneAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(DeepCloneAttachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 实现深度克隆
     * @return DeepCloneWeeklyLog对象
     */
    public DeepCloneWeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //创建字节输出流对象
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //创建对象输出流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        //将对象写入输出流中实现序列化
        objectOutputStream.writeObject(this);

        //创建字节输入流对象
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        //创建对象输入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
        //从输入流中读取对象
        DeepCloneWeeklyLog deepCloneWeeklyLog = (DeepCloneWeeklyLog)objectInputStream.readObject();
        //返回DeepCloneWeeklyLog对象
        return deepCloneWeeklyLog;

    }
}
