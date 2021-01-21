package com.pankx.compositePattern;

/**
 * @author pankx
 * @date 2021/1/21 12:58 下午
 */
public class CompositeTest {

    public static void main(String[] args) {
        AbstractFile imagefile1,imagefile2,imagefile3,videofile1,videofile2,videofile3,folder1,folder2;

        imagefile1 = new ImageFile("图上文件1.jpg");
        imagefile2 = new ImageFile("图片文件2.jpg");
        imagefile3 = new ImageFile("图片文件3.jpg");

        videofile1 = new VideoFile("视频文件1.mp4");
        videofile2 = new VideoFile("视频文件2.mp4");
        videofile3 = new VideoFile("视频文件3.mp4");

        folder1 = new Folder("图片文件");
        folder2 = new Folder("视频文件");

        folder1.add(imagefile1);
        folder1.add(imagefile2);
        folder1.add(imagefile3);

        folder2.add(videofile1);
        folder2.add(videofile2);
        folder2.add(videofile3);

        folder1.killVirus();


    }
}
