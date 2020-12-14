package com.pankx.factorymethod;

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
 * @author pankx
 * @date 2020/12/7 12:16 上午
 */
public class XMLUtil {
    public static Object getBean(){
        try {
            //创建DOM对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new File("./Myconfig.xml"));

            //获取包含类名的文本节点
            NodeList nodeList = document.getElementsByTagName("ClassName");
            Node node = nodeList.item(0).getFirstChild();
            String cname = node.getNodeValue();

            Object object = Class.forName(cname).newInstance();
            return object;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();

        }
        return null;
    }

}
