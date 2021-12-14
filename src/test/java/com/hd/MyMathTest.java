package com.hd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MyMathTest {
    @Test
    void test() {
        MyMath mathUtil = new MyMath();
        int expected = 2;
        int actual = mathUtil.add(1, 1);
        assertEquals(expected, actual);
    }
}