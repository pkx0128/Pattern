package com.pankx.facadepattern;

/**
 * @author pankx
 * @date 2021/1/29 12:51 上午
 */

import com.pankx.facadepattern.abstractfacadepattern.AbstractEncryptFacade;
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
 * 从xml文件中获取外观类
 */
public class GetFacadeForXml {

    public static AbstractEncryptFacade getEncryptFacade() {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;

            try {
                documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(new File("Facade.xml"));
                NodeList nodeList = document.getElementsByTagName("myFacade");
                Node node = nodeList.item(0).getFirstChild();
                String className = node.getNodeValue();

                AbstractEncryptFacade object = (AbstractEncryptFacade) Class.forName(className).newInstance();
                return object;

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
            return null;
    }
}
