package Practice.problem8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata8Test {

    @Test
    void returnEmptyString()
    {
        String x = " ";
        String answer = " ";

        assertEquals(answer, Kata8.orderWeight(x));
    }


    @Test
    void setWights()
    {
        String x = "876 123 100 10 ";

        String answer = "10 100 123 876";

        assertEquals(answer, Kata8.orderWeight(x));
    }

    @Test
    void codeWarsTestBasic()
    {
        assertEquals("2000 103 123 4444 99", Kata8.orderWeight("103 123 4444 99 2000"));
    }

    @Test
    void codeWarsTestBasic2()
    {
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", Kata8.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }


}