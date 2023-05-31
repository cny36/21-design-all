package com.cny.principle.pattern.structural.flyweight;

/**
 * @author : chennengyuan
 */
public class BlackChessman extends AbstraceChessman{

    public BlackChessman(String type) {
        super(type);
        System.out.println("BlackChessman init");
    }
}
