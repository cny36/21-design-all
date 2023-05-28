package com.cny.principle.pattern.create.builder;

/**
 * @author : chennengyuan
 */
public class LowMatchComputerBuilder implements IComputerBuilder{

    private Computer computer;

    public LowMatchComputerBuilder() {
        System.out.println("低配电脑初始化中...");
        this.computer = new Computer();
    }

    @Override
    public void addCpu() {
        this.computer.setCpu(2);
    }

    @Override
    public void addMemory() {
        this.computer.setMemory(8);
    }

    @Override
    public void addDisk() {
        this.computer.setDisk(64);
    }

    @Override
    public Computer builder() {
        return computer;
    }
}
