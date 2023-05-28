package com.cny.principle.pattern.create.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Son implements Cloneable, Serializable {

    private int sonId;

    private String sonName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
