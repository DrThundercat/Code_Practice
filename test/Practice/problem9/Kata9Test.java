package Practice.problem9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Kata9Test {

    @Test
    void simpleMin()
    {
        char[] problem = {'a','b','c'};
        int[] solution = {1,1,1};

        assertArrayEquals(solution,Kata9.findMinSet(problem));
    }

    @Test
    void complexMin()
    {
        char[] problem = {'a','b','a','c','d','a','c','e','f','e','g','h','i','g'};
        int[] solution = {7,3,4};

        assertArrayEquals(solution,Kata9.findMinSet(problem));
    }


}