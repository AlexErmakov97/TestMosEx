package com.company;

public class Convert {

    /**
     * <p>This class perform RLE-conversion
     * Example: Input - "aaaaBBbbCooa"
     * Output - "4a2B2b1C2o1a"
     *
     * @param str
     * @return RLE-conversion string
     */
    public String rleConversion(String str) {
        if (str == null || str.equals("")) {
            System.out.println("Error");
        }
        int currentCharCount = 1;
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) {
                resultString.append(currentCharCount);
                resultString.append(currentChar);
                currentCharCount = 1;
                continue;
            }
            currentCharCount++;
        }
        return resultString.toString();
    }

}
