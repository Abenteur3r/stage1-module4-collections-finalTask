package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new LinkedList<>();
        for(String key : projects.keySet()){
//            System.out.println(i.getKey()+"\t\t"+i.getValue());
            if(projects.get(key).contains(developer)){
                System.out.println(key);
                res.add(key);
            }
        }
        res.sort(new comp());
        return res;
    }
}
class comp implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o2.length(),o1.length());
    }
}
