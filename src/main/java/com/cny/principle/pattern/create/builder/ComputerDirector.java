package com.cny.principle.pattern.create.builder;

/**
 * @author : chennengyuan
 */
public class ComputerDirector {

    private IComputerBuilder computerBuilder;

    public ComputerDirector(IComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer createComputer(){
        computerBuilder.addCpu();
        computerBuilder.addMemory();
        computerBuilder.addDisk();
        return computerBuilder.builder();
    }

}
