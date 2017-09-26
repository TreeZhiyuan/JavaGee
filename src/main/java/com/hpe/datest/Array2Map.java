package com.hpe.datest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by cuizhiyuan on 17-7-20.
 */
public class Array2Map {

    public static void main(String [] args) {
        Map<String, Double> kvs = Arrays.asList("a:1.0", "b:2.0", "c:3.0")
            .stream().map(elem -> elem.split(":"))
                .collect(Collectors.toMap(e -> e[0], e -> Double.parseDouble(e[1])));
    }
}
