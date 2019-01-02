package Practice.Problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata3Test {

    @Test
    void test1()
    {
        double[] x = new double[] {0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25};
        double[] answer = new double[] {45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0};

        assertArrayEquals(answer , Kata3.calculate_sections(x,15));
    }

    @Test
    void small_array()
    {
        double[] x = new double[1];
        double[] answer = new double[0];

        assertArrayEquals(answer , Kata3.calculate_sections(x,15));

    }

    @Test
    void getAvgSpeed()
    {
        double[] x = new double[] {45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0};
        assertEquals(74 , Kata3.avg_speed(x));
    }

    @Test
    void nullArrayTest()
    {
        double[] x = new double[0];
        double[] answer = new double[]{0.0};
        assertArrayEquals(answer , Kata3.calculate_sections(x,15));

    }

    @Test
    void getAvgSpeedBadArray()
    {
        double[] x = new double[] {0.0};
        assertEquals(0 , Kata3.avg_speed(x));
    }
}