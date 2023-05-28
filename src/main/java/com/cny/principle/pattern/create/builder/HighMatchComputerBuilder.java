package com.cny.principle.pattern.create.builder;

/**
 * @author : chennengyuan
 */
public class HighMatchComputerBuilder implements IComputerBuilder{

    private Computer computer;

    public HighMatchComputerBuilder() {
        System.out.println("高配电脑初始化中...");
        this.computer = new Computer();
    }

    @Override
    public void addCpu() {
        this.computer.setCpu(16);
    }

    @Override
    public void addMemory() {
        this.computer.setMemory(32);
    }

    @Override
    public void addDisk() {
        this.computer.setDisk(4096);
    }

    @Override
    public Computer builder() {
        return computer;
    }
}
