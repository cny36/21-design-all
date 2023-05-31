package com.cny.principle.pattern.behavioral.template;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractDeveloper javadeveloper = new JavaDeveloper();
        javadeveloper.work();

        System.out.println("-------------------------------");

        AbstractDeveloper godeveloper = new GoDeveloper();
        godeveloper.work();
    }

}
