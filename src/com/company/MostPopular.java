package com.company;

import java.util.*;

public class MostPopular {
    private int[] array;

    public void setArray(int[] array) {

        this.array = array;
    }

    private Map<Integer, Integer> getMap(int[] array) {
        
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : this.array) {
            Integer count = result.get(element);
            if (count == null)
                count = 0;
            result.put(element, ++count);
        }
        return result;
    }


    private Set<Integer> mostPopular() {

        Map<Integer, Integer> map = getMap(array);
        Collection<Integer> values = map.values();
        Integer max = Collections.max(values);
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max.equals(entry.getValue())) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public String getResult() {
        return mostPopular().toString();
    }

}
