package sdet;

import org.example.sdet.LeetCodeByHuman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntTest {

    LeetCodeByHuman leetCodeByHuman = new LeetCodeByHuman();

    //Human++ since it's grouped test data by scenario
    @ParameterizedTest
    @MethodSource("allSymbols")
    void testEverySymbol(String symbol, int expectedValue) {
        int actualInt = leetCodeByHuman.romanToInt(symbol);
        assertEquals(expectedValue, actualInt);
    }

    private static Stream<Arguments> allSymbols() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("V", 5),
                Arguments.of("X", 10),
                Arguments.of("L", 50),
                Arguments.of("C", 100),
                Arguments.of("D", 500),
                Arguments.of("M", 1000)
        );
    }

    //Human++ for naming that reveal the goal of test
    @Test
    void testAdding() {
        int actualInt = leetCodeByHuman.romanToInt("VII");
        assertEquals(7, actualInt);
    }


    @Test
    void testSubtract() {
        int actualInt = leetCodeByHuman.romanToInt("IV");
        assertEquals(4, actualInt);
    }


    @Test
    void testBig() {
        int actualInt = leetCodeByHuman.romanToInt("MDCLXVI");
        assertEquals(1666, actualInt);
    }


    @Test
    void testMax() {
        int actualInt = leetCodeByHuman.romanToInt("MMMCMXCIX");
        assertEquals(3999, actualInt);
    }
}
