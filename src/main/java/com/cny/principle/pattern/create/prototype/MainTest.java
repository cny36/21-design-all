package com.cny.principle.pattern.create.prototype;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        SuperPersion superPersion = new SuperPersion();
        superPersion.setId(1);
        superPersion.setName("zs");
        Son son = new Son(11, "son11");
        superPersion.setSon(son);
        System.out.println(superPersion);

        SuperPersion superPersion2 = (SuperPersion) superPersion.clone();
        System.out.println(superPersion2);

        System.out.println("======================");

        superPersion2.getSon().setSonId(22);
        System.out.println(superPersion);
        System.out.println(superPersion2);
    }

}
