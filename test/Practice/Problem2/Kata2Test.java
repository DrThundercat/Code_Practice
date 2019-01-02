package Practice.Problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {

    @Test
    void test2()
    {
        int array [] = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        assertArrayEquals(array, Kata2.addition(10));
    }

    @Test
    void test3()
    {
        int array [] = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        assertEquals(4, Kata2.countDigits(array,1));
    }

}