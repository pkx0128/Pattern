package com.pankx.prototype;

/**
 * java语言实现原型模式中的浅克隆
 * @author pankx
 * @date 2020/12/17 12:40 上午
 */

/**
 * 定义周报原型实现类WeeklyLog
 */
public class WeeklyLog implements Cloneable {//java语言实现原型模式原型实现类需要实现接口Cloneable
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
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
     * 使用clone方法实现浅克隆
     * @return
     */
    @Override
    public WeeklyLog clone(){

        Object object;
        try {
            object = super.clone();//直接调用父类Object中的clone方法实现浅克隆
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }
}
