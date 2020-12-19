package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/19 11:57 下午
 */

/**
 * 对象适配器模式的适配器类
 */
public class ObjectAdapter extends ObjectAdapterTarget {
    WeChat weChat;

    public ObjectAdapter(WeChat weChat){
        this.weChat = weChat;
    }
    @Override
    public void chat(){
        weChat.weChat();
    }
}
