package Practice.Problem4;

import java.util.*;

public class Kata4 {

    public static String jumbleWord(String s, int shift)
    {
       StringBuilder myWord = new StringBuilder(s);

       for(int i =0; i < s.length(); i++)
       {
        if(Character.isLetter(myWord.charAt(i))) {
            if(myWord.charAt(i) >= 97)
            {
                myWord.replace(i,i+1,Character.toString((char)(((myWord.charAt(i) - (int)'a') + shift + i) %26 + (int)'a')));
            }
            else{
                myWord.replace(i,i+1,Character.toString((char)(((myWord.charAt(i) -(int)'A') + shift + i) %26 + (int)'A')));
            }
        }
       }
       return myWord.toString();
    }

    public static List<String> WordBreakDown(String word)
    {
            List<String> answer = new ArrayList<>();
            StringBuilder myWord = new StringBuilder(word);
            int divValue = myWord.length()/5;
            int count = 0;
            int temp = divValue;

            if((myWord.length() % 5) == 0)
            {
                 while(count < myWord.length())
                 {
                     answer.add(myWord.substring(count, temp));
                     count = count + divValue;
                     temp = count + divValue;
                 }
            }
            else
            {
                temp = divValue +1;
                divValue = divValue +1;
                while(count < myWord.length())
                {
                    answer.add(myWord.substring(count, temp));
                    count = count + divValue;
                    if(count + divValue > myWord.length())
                    {
                        answer.add(myWord.substring(count));
                        count = myWord.length();
                    }
                    temp = count + divValue;
                }
            }
        return answer;
    }

    public static String WordJoin(List<String> myList)
    {
        StringBuilder myWord = new StringBuilder();

        for(String s: myList)
        {
            myWord.append(s);
        }

        String answer = myWord.toString();

        return answer;
    }

    public static String unjumbleWord(String s, int shift)
    {
        StringBuilder myWord = new StringBuilder(s);

        for(int i =0; i < s.length(); i++)
        {
            if(Character.isLetter(myWord.charAt(i))) {
                if(myWord.charAt(i) >=97)
                {
                    myWord.replace(i, i + 1, Character.toString((char)((((myWord.charAt(i) - 'a') - shift -i +(1+i/26)*26) %26 + 'a'))));
                }
                else
                {
                    myWord.replace(i, i + 1, Character.toString((char)((((myWord.charAt(i) - 'A') - shift -i +(1+i/26)*26) %26 + 'A'))));
                }
            }
        }

        return myWord.toString();
    }
}
