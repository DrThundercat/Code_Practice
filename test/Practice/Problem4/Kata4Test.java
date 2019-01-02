package Practice.Problem4;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {

    @Test
    void WordJubmle()
    {
        String s = "I should have known that you would have a perfect answer for me!!!";
        String answer ="J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!";

        assertEquals(answer, Kata4.jumbleWord(s,1));
    }

    @Test
    void DivideWords()
    {
        String x ="J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!";
        List<String> answer = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");

        assertEquals(answer, Kata4.WordBreakDown(x));
    }

    @Test
    void Remake_Word()
    {
        String answer ="J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!";
        List<String> x = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");

        assertEquals(answer,Kata4.WordJoin(x));
    }

    @Test
    void Proper_Word()
    {
        String answer = "I should have known that you would have a perfect answer for me!!!";
        String x = "J vltasl rlhr zdfog odxr ypw atasl rlhr p gwkzzyq zntyhv lvz wp!!!";

        assertEquals(answer, Kata4.unjumbleWord(x,1));
    }

    @Test
    void newWordTest_Split()
    {
        String x = "wdsVuw sh qu dii hevGs uzbicaudhoxuMWewxfdu O";
        List<String> answer = Arrays.asList("wdsVuw sh", " qu dii h", "evGs uzbi", "caudhoxuM", "Wewxfdu O");

        assertEquals(answer, Kata4.WordBreakDown(x));
    }
}
