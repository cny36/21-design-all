package com.cny.principle.pattern.create.builder;

/**
 * @author : chennengyuan
 */
public interface IComputerBuilder {

    /**
     * 添加Cpu
     */
    void addCpu();

    /**
     * 添加内存
     */
    void addMemory();

    /**
     * 添加硬盘
     */
    void addDisk();


    Computer builder();
}
