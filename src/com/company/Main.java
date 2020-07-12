package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        String testStr = "qqBBbbCoa";
//        System.out.println(new Convert().rleConversion(testStr));

        int[] array = {1, 6, 8, 0, 9, 1, 1, 1, 0, 0};
        MostPopular mostPopular = new MostPopular();
        mostPopular.setArray(array);
        System.out.println(mostPopular.getResult());

    }


}
