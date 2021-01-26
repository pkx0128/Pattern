package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/27 12:21 上午
 */

/**
 * 外观模式中的外观类
 *
 */
public class EncryptFacade {
    /**
     * 维持子系统FileReader,FileWriter,CipherMachine一个对象的引用
     */
    FileReader fileReader;
    FileWriter fileWriter;
    CipherMachine cipherMachine;

    public EncryptFacade(){
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        cipherMachine = new CipherMachine();
    }

    public void fileEncrypt(String encryptstr,String filename) {
        String fstr = fileReader.read(filename);
        String estr = cipherMachine.encrypt(fstr);
        fileWriter.saveFile(estr,filename);
        System.out.println("保存到文件");
    }

}
