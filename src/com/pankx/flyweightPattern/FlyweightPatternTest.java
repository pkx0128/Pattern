package com.pankx.flyweightPattern;

/**
 * @author pankx
 * @date 2021/2/1 12:17 上午
 */

/**
 * 享元模式测试
 */
public class FlyweightPatternTest {
    public static void main(String[] args) {

        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getIgoChessmanFactory();

        IgoChessman blackIgoChessman1,blackIgoChessman2,whiteIgoChessman1,whiteIgoChessman2;

        blackIgoChessman1 = igoChessmanFactory.getIgoChessman("black");
        blackIgoChessman2 = igoChessmanFactory.getIgoChessman("black");

        whiteIgoChessman1 = igoChessmanFactory.getIgoChessman("white");
        whiteIgoChessman2 = igoChessmanFactory.getIgoChessman("white");

        blackIgoChessman1.display();
        blackIgoChessman2.display();
        System.out.println("blackIgoChessman1与blackIgoChessman2为同一对象 = " + (blackIgoChessman1 == blackIgoChessman2));
        whiteIgoChessman1.display();
        whiteIgoChessman2.display();
        System.out.println("whiteIgoChessman1与whiteIgoChessman2为同一对象 = " + (whiteIgoChessman1 == whiteIgoChessman2));

    }
}
