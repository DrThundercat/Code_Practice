package Practice.Problem6;

import java.util.*;

public class Kata6 {


    public static String [] getDataset(String findCity, String data)
    {
        String [] answer= new String[2];
        String [] citys = data.split("\n");

        //for each string in split new line
        for(String city: citys)
        {
            if(city.startsWith(findCity + ":"))
            {
                answer = city.split(":");
                break;
            }
            else
            {
                answer[0] = "-1";
                answer[1] = "-1";
            }
        }

        return answer;
    }


    public static double [] getDataPiece(String [] data)
    {



        String [] splitSet = data[1].split(",");
        List<String [] > stringNumberList = new ArrayList<>();
        double [] numberList;

        if(data[1].equals("-1"))
        {
            numberList = new double[]{-1.0};
            return numberList;
        }

        numberList = new double[12];

        for(String s: splitSet)
        {
            stringNumberList.add(s.split(" "));
        }

        for(int i =0; i < numberList.length; i++)
        {
            numberList[i] = Double.parseDouble(stringNumberList.get(i)[1]);
        }

        return numberList;
    }


    public static double getAverage(double [] numberList)
    {
        double total = 0;
        for(double d: numberList)
        {
            total = total + d;
        }

        total = total/numberList.length;

        return total;
    }

    public static double[] getVarience(double [] numberList, double avg)
    {

        double [] answer;
        if(avg == -1.0)
        {
            answer = new double[]{-1.0};
            return answer;
        }

       answer = new double[12];
        for(int i = 0; i < numberList.length; i++ )
        {
            answer[i] = Math.pow((numberList[i] - avg),2);
        }

        return answer;
    }


}
