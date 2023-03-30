package org.example.chatGPT;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntWithDocs {

    /**
     * Converts a Roman numeral string to an integer.
     *
     * @param s a string representing a valid Roman numeral in the range [1, 3999].
     * @return the integer value of the Roman numeral.
     */
    //ChadGPT version slightly better since mentione range of String s
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanValues.get(s.charAt(i));
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
            prev = current;
        }
        return result;
    }
}
