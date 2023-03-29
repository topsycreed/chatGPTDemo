package org.example.sdet;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCodeByHuman {

    public int romanToInt(String s) {
        Map<Character, Integer> values = new LinkedHashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);


        int number = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if (i - 1 >= 0 && values.get(s.charAt(i - 1)) < values.get(s.charAt(i))) {
                number -= values.get(s.charAt(i - 1));
                number += values.get(s.charAt(i));
                i--;
            } else {
                number += values.get(s.charAt(i));
            }
        }
        return number;
    }

}
