package com.pankx.facadepattern.abstractfacadepattern;

/**
 * @author pankx
 * @date 2021/1/29 12:10 上午
 */

import com.pankx.facadepattern.FileReader;
import com.pankx.facadepattern.FileWriter;

/**
 * 抽象外观类的具体实现类
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader fileReader;
    private NewCipherMachine newCipherMachine;
    private FileWriter fileWriter;

    public NewEncryptFacade(){
        fileReader = new FileReader();
        newCipherMachine = new NewCipherMachine();
        fileWriter = new FileWriter();
    }


    @Override
    public void fileEncrypt(String str, String fileName) {
        String s =  fileReader.read(fileName);
        String es = newCipherMachine.encrypt(s);
        fileWriter.saveFile(es,fileName);
    }
}
