package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/23 11:33 上午
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 外观模式的子系统
 * 读取文件内容
 */
public class FileReader {
    public String read(String fileNameSrc){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(fileNameSrc));
            int data;
            while ((data = fileInputStream.read()) != -1) {
                stringBuffer = stringBuffer.append((char)data);
            }
            fileInputStream.close();
            System.out.println(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件操作错误");
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
