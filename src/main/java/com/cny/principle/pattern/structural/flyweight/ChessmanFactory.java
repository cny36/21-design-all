package com.cny.principle.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : chennengyuan
 */
public class ChessmanFactory {

    private static final Map<String, AbstraceChessman> chessmapMap = new HashMap<>();

    static {
        chessmapMap.put("W", new WhiteChessman("白棋"));
        chessmapMap.put("B", new BlackChessman("黑棋"));
    }

    public static AbstraceChessman getChessman(String type) throws Exception {
        AbstraceChessman chessman = chessmapMap.get(type);
        if (chessman == null) {
            throw new Exception("type:" + type + " 没有对应的类");
        }
        return chessman;
    }
}
