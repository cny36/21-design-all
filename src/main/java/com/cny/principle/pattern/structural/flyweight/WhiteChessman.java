package com.cny.principle.pattern.structural.flyweight;

/**
 * @author : chennengyuan
 */
public class WhiteChessman extends AbstraceChessman{

    public WhiteChessman(String type) {
        super(type);
        System.out.println("WhiteChessman init");
    }
}
