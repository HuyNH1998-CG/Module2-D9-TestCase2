import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testGetNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay4() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay5() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay6() {
        int day = 19;
        int month = 5;
        int year = 2019;
        String expected = "20/5/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testGetNextDay7() {
        int day = 30;
        int month = 9;
        int year = 2019;
        String expected = "1/10/2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }


}