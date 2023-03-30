package org.example.sdet;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCodeByHumanWithDocs {

    /**
     * Converting string roman characters to int value
     * @param s string with roman chars
     * @return converted int value
     */
    public int romanToInt(String s) {
        Map<Character, Integer> values = new LinkedHashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        //Human-- since it's better to refactor code that to add comments
        int number = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if (i - 1 >= 0 && values.get(s.charAt(i - 1)) < values.get(s.charAt(i))) {
                //if before we have less number - it will be substracted
                number -= values.get(s.charAt(i - 1));
                //add current value
                number += values.get(s.charAt(i));
                //skip already substracted value
                i--;
            } else {
                number += values.get(s.charAt(i));
            }
        }
        return number;

    }

}
