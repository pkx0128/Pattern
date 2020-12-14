package com.pankx.builderpattern;

/**
 * @author pankx
 * @date 2020/12/14 12:27 上午
 */

/**
 * 建造者模式中的抽象建造者
 */
public abstract class ActorBuilder {
    Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public abstract boolean isBareheaded();//添加勾子方法(Hook method)isBareheader控制是否建造Hairstyle

    /**
     * 返回actor对象
     * @return
     */
    public Actor createActor(){
        return actor;
    }
}
