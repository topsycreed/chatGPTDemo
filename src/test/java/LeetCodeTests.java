import org.example.sdet.LeetCodeByHuman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.chatGPT.LeetCodeByChatGPT.romanToInt;

public class LeetCodeTests {

    private final LeetCodeByHuman leetCodeByHuman = new LeetCodeByHuman();

    @Test
    void simpleChatGPTTest() {
        String romanNumeral = "XXIV";
        int intValue = romanToInt(romanNumeral);
        Assertions.assertEquals(24, intValue);
    }

    @Test
    void simpleHumanTest() {
        String romanNumeral = "XXIV";
        int intValue = leetCodeByHuman.romanToInt(romanNumeral);
        Assertions.assertEquals(24, intValue);
    }
}
