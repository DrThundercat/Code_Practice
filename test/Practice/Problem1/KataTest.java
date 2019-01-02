package Practice.Problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void test1()
    {
        assertEquals("Hi",Kata.remove("Hi!",1) );
    }

    @Test
    void test2()
    {
        assertEquals("Hi!!!", Kata.remove("Hi!!!!",1));
    }

    @Test
    void test3()
    {
        assertEquals("Hi", Kata.remove("Hi!!!", 100));
    }

    @Test
    void test4()
    {
        assertEquals("Hi", Kata.remove("!Hi", 1));
    }

    @Test
    void test5()
    {
        assertEquals("Hi!!", Kata.remove("Hi!!!", 1));
    }
    @Test
    void test6()
    {
        assertEquals("Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 3));
    }
}