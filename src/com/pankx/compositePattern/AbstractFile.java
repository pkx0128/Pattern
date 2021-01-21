package com.pankx.compositePattern;

/**
 * @author pankx
 * @date 2021/1/21 11:16 上午
 */

/**
 * 组合模式的抽象构件类
 */

public abstract class AbstractFile {
    /**
     * 增加成员
     * @param file
     */
    public abstract void add(AbstractFile file);

    /**
     * 删除成员
     * @param file
     */
    public abstract void remove(AbstractFile file);

    /**
     * 获取成员
     * @param i
     * @return
     */
    public abstract AbstractFile getChild(int i);

    /**
     * 业务方法
     */
    public abstract void killVirus();

}
