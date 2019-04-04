package Practice.problem9;

import java.util.ArrayList;
import java.util.List;

public class Kata9 {

    public static int[] findMinSet(char[] problem)
    {
        int [] aplha = new int [256];
        var farthest = -1;
        var count =0;

        List<Integer> answer = new ArrayList<>();

        //get the end of the index
        for( var i = problem.length-1; i >= 0; i --)
        {
            var charval = Character.getNumericValue(problem[i]);

            if(aplha[charval] == 0) {
                aplha[charval] = i;
            }
        }

        for(var j =0; j < problem.length;j++)
        {
            var charval = problem[j];

            if(farthest < aplha[Character.getNumericValue(charval)])
            {
                farthest = aplha[Character.getNumericValue(charval)];
            }

            count++;

            if( farthest == j)
            {
                answer.add(count);
                count = 0;
            }

        }



        int [] finalAns = new int[answer.size()];

        for(int k =0; k < answer.size();k++)
        {
                finalAns[k] = Integer.valueOf(answer.get(k));
        }

        return finalAns;

    }

}
