package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new LinkedList<>();
        for(Map.Entry<String, Set<String>> i : projects.entrySet()){
            if(i.getValue().toString().contains(developer)){
                res.add(i.getKey());
            }
        }
        res.sort(new comp());
        return res;
    }
}
class comp implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()){
            return -o1.compareToIgnoreCase(o2);

        }
        return Integer.compare(o2.length(),o1.length());
    }
}
