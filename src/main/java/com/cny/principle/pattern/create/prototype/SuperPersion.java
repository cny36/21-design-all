package com.cny.principle.pattern.create.prototype;

import lombok.*;

import java.io.*;

/**
 * @author : chennengyuan
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SuperPersion implements Cloneable, Serializable {

    private int id;
    private String name;

    private Son son;


    @SneakyThrows
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = null;
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //完成序列化
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        objectOutputStream = new ObjectOutputStream(arrayOutputStream);
        objectOutputStream.writeObject(this);

        //完成反序列化
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        objectInputStream = new ObjectInputStream(arrayInputStream);
        object = objectInputStream.readObject();

        return object;
    }
}
