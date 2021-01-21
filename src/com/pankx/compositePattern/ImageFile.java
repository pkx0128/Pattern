package com.pankx.compositePattern;

/**
 * @author pankx
 * @date 2021/1/21 12:18 下午
 */

/**
 * 组合模式的叶子构件
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name){
        this.name = name;
    }

    /**
     * 增加成员
     *
     * @param file
     */
    @Override
    public void add(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    /**
     * 删除成员
     *
     * @param file
     */
    @Override
    public void remove(AbstractFile file) {
        System.out.println("不支持此方法");
    }

    /**
     * 获取成员
     *
     * @param i
     * @return
     */
    @Override
    public AbstractFile getChild(int i) {
        System.out.println("不支持此方法");
        return null;
    }

    /**
     * 业务方法
     */
    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("-----------对象图片文件：" + name + "进行杀毒");
    }
}
