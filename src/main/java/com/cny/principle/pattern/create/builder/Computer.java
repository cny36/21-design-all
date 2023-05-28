package com.cny.principle.pattern.create.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : chennengyuan
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Computer {

    int cpu;

    int memory;

    int disk;

}
