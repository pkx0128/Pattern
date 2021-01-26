package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/27 12:10 上午
 */

import java.io.*;

/**
 * 外观模式中的子系统
 * 保存加密后的文件
 */
public class FileWriter {

    public void saveFile(String encryptStr,String fileName){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
            fileOutputStream.write(encryptStr.getBytes());
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件写入失败");
            e.printStackTrace();
        }
    }

}
