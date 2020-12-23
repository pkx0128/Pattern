package com.pankx.bridgepattern;

/**
 * @author pankx
 * @date 2020/12/23 1:22 下午
 */

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * 读取外部xml文件中的对象工具类
 */
public class GetObjectForXml {
    public static Object getBean(String objectName){
        //创建文档对象
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = null;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/com/pankx/bridgepattern/config.xml"));

            NodeList nodeList = document.getElementsByTagName("className");
            String className = null;
            if(objectName.equals("image")){
                Node node = nodeList.item(0).getFirstChild();
                className = node.getNodeValue();
            }else if(objectName.equals("os")) {
                Node node = nodeList.item(1).getFirstChild();
                className = node.getNodeValue();
            }

            Object object = Class.forName(className).newInstance();
            return  object;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
