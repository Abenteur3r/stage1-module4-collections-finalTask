package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();
        for (String i :sourceMap.keySet()){
            Set<String> foo = new HashSet<>();
            foo.add(i);
            if (res.containsKey(i.length())) {
                foo.addAll(res.get(i.length()));
                res.replace(i.length(),foo);
            } else {
                res.put(i.length(),foo);
            }
        }
        System.out.println(res);
        return res;
    }
}
