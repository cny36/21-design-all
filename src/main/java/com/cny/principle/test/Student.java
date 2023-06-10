package com.cny.principle.test;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author : chennengyuan
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;

    private String name;

    private Integer age;

    private BigDecimal price;
}
