package com.cny.principle.pattern.create.builder;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector(new HighMatchComputerBuilder());
        System.out.println(computerDirector.createComputer());

        ComputerDirector computerDirector2 = new ComputerDirector(new LowMatchComputerBuilder());
        System.out.println(computerDirector2.createComputer());
    }

}
