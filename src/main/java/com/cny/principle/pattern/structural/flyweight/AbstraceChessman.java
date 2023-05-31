package com.cny.principle.pattern.structural.flyweight;

import lombok.Data;

/**
 * 黑白棋抽象类
 *
 * @author : chennengyuan
 */
@Data
public abstract class AbstraceChessman {

    /**
     * 类型 区分黑白棋子
     */
    private String type;

    private int x;
    private int y;

    public void setCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public AbstraceChessman(String type){
        this.type = type;
    }

    public String toString(){
        return type+"[x:"+x+",y:"+y+"]";
    }



}
