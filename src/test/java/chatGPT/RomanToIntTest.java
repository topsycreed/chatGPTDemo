package chatGPT;

import org.example.chatGPT.RomanToInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntTest {

    //ChatGPT-- for strange method naming
    @Test
    public void testRomanToInt_InputI_Returns1() {
        String romanNumeral = "I";
        int expected = 1;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputV_Returns5() {
        String romanNumeral = "V";
        int expected = 5;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputIV_Returns4() {
        String romanNumeral = "IV";
        int expected = 4;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    //ChadGPT-- like it's duplicated scenario, not checking anything new
    @Test
    public void testRomanToInt_InputIX_Returns9() {
        String romanNumeral = "IX";
        int expected = 9;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputX_Returns10() {
        String romanNumeral = "X";
        int expected = 10;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputXL_Returns40() {
        String romanNumeral = "XL";
        int expected = 40;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputXC_Returns90() {
        String romanNumeral = "XC";
        int expected = 90;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputCD_Returns400() {
        String romanNumeral = "CD";
        int expected = 400;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputCM_Returns900() {
        String romanNumeral = "CM";
        int expected = 900;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputM_Returns1000() {
        String romanNumeral = "M";
        int expected = 1000;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputMMXXI_Returns2021() {
        String romanNumeral = "MMXXI";
        int expected = 2021;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanToInt_InputMMMCMXCIX_Returns3999() {
        String romanNumeral = "MMMCMXCIX";
        int expected = 3999;
        int actual = RomanToInt.romanToInt(romanNumeral);
        assertEquals(expected, actual);
    }
}
