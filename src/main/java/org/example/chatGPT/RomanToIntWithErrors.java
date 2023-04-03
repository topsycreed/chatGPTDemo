package org.example.chatGPT;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntWithErrors {
    /*
    public static integer romanToInt(String s) {
        Map<Character, Integer> romanValues = new Map<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1001);

        int result;
        int prev = 0;
        if (s == null || s.isEmpty()) {
            throw new RuntimeException("Input string cannot be null or empty");
        }
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
     */

    /*
    ChatGPT answer:
    Here are the mistakes I found in the Java code:
    1. The return type of the romanToInt method should be int, not integer. Java is case-sensitive, so using the lowercase integer will result in a compilation error.
    2. The Map interface cannot be instantiated directly, so the line Map<Character, Integer> map = new Map<>(); will result in a compilation error. Instead, you should use a concrete implementation of Map, such as HashMap.
    3. The value for the Roman numeral "M" in the mapping is incorrect. It should be 1000, not 1001.
    4. The result variable is not initialized, which will result in a compilation error if you try to use it without assigning a value to it first.
    5. The RuntimeException thrown for null or empty input should be an IllegalArgumentException, which is a more appropriate exception to use for this case.
    */

    /*
    Human answer:
    1. The return type should be int, not integer.
    2. Wrong Map initialization using interface.
    3. The value for the "M" is incorrect, not 1001.
    4. The result variable is not initialized.
    5. Signature of the method should have throws.
    */

    /*
    In total ChatGPT found all issues, human found only 4 out of 5. And about throws was incorrect guess, so it's false negative case.
    */
}
