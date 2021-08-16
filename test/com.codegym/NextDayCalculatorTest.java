package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing day 1/1/2018 --> 2/1/2018")
    public void testcase1() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(1, 1);
        int expected = 2;
        int actual = nextDayCalculator.NextDay();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Testing day 31/1/2018 --> 1/2/2018")
    public void testcase2() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(31, 1);
        int expected = 1;
        int actual = nextDayCalculator.NextDay();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing day 30/4/2018 --> 1/5/2018")
    public void testcase3() {
        NextDayCalculator nextDayCalculator = new NextDayCalculator(30, 4);
        int expected = 1;
        int actual = nextDayCalculator.NextDay();
        assertEquals(expected, actual);
    }

}

