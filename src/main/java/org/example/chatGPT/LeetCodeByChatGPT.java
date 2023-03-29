package org.example.chatGPT;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeByChatGPT {

    //better to use static method as util, ChatGPT++
    public static int romanToInt(String s) {
        //HashMap has more sense here, ChatGPT++
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
        //ChatGPT doesn't check that s - not null, ChatGPT--
        //Me too, but I know that s - valid string by requirements, but ChatGPT didn't know that
        for (int i = s.length() - 1; i >= 0; i--) {
            //better readability with introducing prev variable, ChatGPT++
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
