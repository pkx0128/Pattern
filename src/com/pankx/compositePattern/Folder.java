package com.pankx.compositePattern;

/**
 * @author pankx
 * @date 2021/1/21 12:44 下午
 */

import java.util.ArrayList;

/**
 * 组合模式中的容器构件
 */
public class Folder extends AbstractFile  {

    private ArrayList<AbstractFile> list = new ArrayList<AbstractFile>();

    private String name;

    public Folder(String name){
        this.name = name;
    }
    /**
     * 增加成员
     *
     * @param file
     */
    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    /**
     * 删除成员
     *
     * @param file
     */
    @Override
    public void remove(AbstractFile file) {
        list.remove(file);
    }

    /**
     * 获取成员
     *
     * @param i
     * @return
     */
    @Override
    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    /**
     * 业务方法
     */
    @Override
    public void killVirus() {
        System.out.println("------------对文件夹：" + name + "进行杀毒");

        for(AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
