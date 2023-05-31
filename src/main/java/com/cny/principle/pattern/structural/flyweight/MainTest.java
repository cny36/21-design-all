package com.cny.principle.pattern.structural.flyweight;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) throws Exception {
        AbstraceChessman b1 = ChessmanFactory.getChessman("B");
        b1.setCoordinate(1,1);
        System.out.println(b1);

        AbstraceChessman w1 = ChessmanFactory.getChessman("W");
        w1.setCoordinate(2,2);
        System.out.println(w1);

        AbstraceChessman b2 = ChessmanFactory.getChessman("B");
        b2.setCoordinate(3, 3);
        System.out.println(b2);

        AbstraceChessman w2 = ChessmanFactory.getChessman("W");
        w2.setCoordinate(4,4);
        System.out.println(w2);
    }

}
