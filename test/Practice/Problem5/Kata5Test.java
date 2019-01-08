package Practice.Problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata5Test {

//    @Test
//    void FindOnes()
//    {
//        char[][] mountain = {
//                "^^^^^^        ".toCharArray(),
//                " ^^^^^^^^     ".toCharArray(),
//                "  ^^^^^^^     ".toCharArray(),
//                "  ^^^^^       ".toCharArray(),
//                "  ^^^^^^^^^^^ ".toCharArray(),
//                "  ^^^^^^      ".toCharArray(),
//                "  ^^^^        ".toCharArray()
//        };
//
//        char[][] answer = {
//                "111111        ".toCharArray(),
//                " 1^^^^111     ".toCharArray(),
//                "  1^^^^11     ".toCharArray(),
//                "  1^^^1       ".toCharArray(),
//                "  1^^^^111111 ".toCharArray(),
//                "  1^^^11      ".toCharArray(),
//                "  1111        ".toCharArray()
//        };
//
//
//        assertArrayEquals(answer, Kata5.peakHeight(mountain));
//
//    }

//    @Test
//    public void zeroForEmptyMap()
//    {
//        char[][] mountain = {
//                ' '
//        };
//        assertEquals(0, Kata5.peakHeight(mountain));
//    }
//
//    public void oneForSinglePeak()
//    {
//        char[][] mountain = {
//                '^'
//        };
//        assertEquals(1, Kata5.peakHeight(mountain));
//    }
//
//    public void doublePeak()
//    {
//        char[][] mountain = {
//                ' ','^', '^'
//        };
//        assertEquals(1, Kata5.peakHeight(mountain));
//    }

    @Test
    public void ex() {
        char[][] mountain = {
                "^^^^^^        ".toCharArray(),
                " ^^^^^^^^     ".toCharArray(),
                "  ^^^^^^^     ".toCharArray(),
                "  ^^^^^       ".toCharArray(),
                "  ^^^^^^^^^^^ ".toCharArray(),
                "  ^^^^^^      ".toCharArray(),
                "  ^^^^        ".toCharArray()
        };
        assertEquals(3, Kata5.peakHeight(mountain));
    }

    @Test
    public void test12() {
        char[][] mountain = {
                "       ^^^^^^^^^^^^^^^^^^^^^^^^                                                           ".toCharArray(),
                "        ^^^^^^^^^^^^^^^^^^^^^^                   ^                                        ".toCharArray(),
                "         ^^^^^^^^^^^^^^^^^^^^^                  ^                                         ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^^^^^                   ^^^                                       ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^^^^^^                 ^^^^^^                                     ".toCharArray(),
                "       ^^^^^^^^^^^^^^^^^^^^^^^^               ^^^^^                                       ".toCharArray(),
                "        ^^^^^^^^^^^^^^^^^^^^^^^                ^^^^                                       ".toCharArray(),
                "         ^^^^^^^^^^^^^^^^^^^^^^               ^^^^^                                       ".toCharArray(),
                "         ^^^^^^^^^^^^^^^^^^^^^^                ^^^^^                                      ".toCharArray(),
                "           ^^^^^^^^^^^^^^^^^^^^               ^^^^^^^^                                    ".toCharArray(),
                "          ^^^^^^^^^^^^^^^^^^^^^               ^^^^^^^^^                                   ".toCharArray(),
                "        ^^^^^^^^^^^^^^^^^^^^^^                ^^^^^^^^^^                                  ".toCharArray(),
                "          ^^^^^^^^^^^^^^^^^^^^^                ^^^^^^^                                    ".toCharArray(),
                "            ^^^^^^^^^^^^^^^^^^^^               ^^^^^                                      ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^^^^              ^^^^^^^                                     ".toCharArray(),
                "            ^^^^^^^^^^^^^^^^^^^^^             ^^^^^^                                      ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^^^^^              ^^^^^^                                     ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^^^^            ^^^^^^^^                                    ".toCharArray(),
                "                ^^^^^^^^^^^^^^^^^            ^^^^^^^^^                                    ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^              ^^^^^^^                                     ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^              ^^^^^^                                      ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^               ^^^^^^                                      ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^^^               ^^^^^^^^                                    ".toCharArray(),
                "              ^^^^^^^^^^^^^^^^                ^^^^^^^^                                    ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^                  ^^^^^^^^^                                  ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^                  ^^^^^^^^                                   ".toCharArray(),
                "              ^^^^^^^^^^^^^^^^                  ^^^^^^^^^                                 ".toCharArray(),
                "            ^^^^^^^^^^^^^^^^^^^                ^^^^^^^^^^^^                               ".toCharArray(),
                "            ^^^^^^^^^^^^^^^^^^^^                ^^^^^^^^^                                 ".toCharArray(),
                "              ^^^^^^^^^^^^^^^^^                 ^^^^^^^^                                  ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^^                 ^^^^^^^                                  ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^                 ^^^^^^^^^                                ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^^                ^^^^^^^                                  ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^^^^                ^^^^^^^                                 ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^^^^              ^^^^^^^^^                                ".toCharArray(),
                "                ^^^^^^^^^^^^^^^^^^              ^^^^^^^^^^                                ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^^^^             ^^^^^^^^^^^^^                              ".toCharArray(),
                "                 ^^^^^^^^^^^^^^^^^             ^^^^^^^^^^^                                ".toCharArray(),
                "               ^^^^^^^^^^^^^^^^^^^^            ^^^^^^^^^^^                                ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^^^^^^            ^^^^^^^^^^^^^                               ".toCharArray(),
                "              ^^^^^^^^^^^^^^^^^^^^           ^^^^^^^^^^^^^                                ".toCharArray(),
                "             ^^^^^^^^^^^^^^^^^^^^^            ^^^^^^^^^^^                                 ".toCharArray(),
                "              ^^^^^^^^^^^^^^^^^^^             ^^^^^^^^^^^^^                               ".toCharArray()
        };
        assertEquals(11, Kata5.peakHeight(mountain));
    }

}