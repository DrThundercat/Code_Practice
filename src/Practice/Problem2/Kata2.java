package Practice.Problem2;

public class Kata2 {

    public static int [] addition(int number)
    {
        int [] answser = new int[number +1];
        for(int i =0; i <= number; i++)
        {
            answser[i] = i * i;
//            System.out.println("value at index: " + i + " is value: "+answser[i]);
        }


        return answser;
    }

    public static int countDigits(int [] numbers, int digit)
    {
        int x = 0;

        for(int i :numbers)
        {
            String temp = String.valueOf(i);
            StringBuilder myString = new StringBuilder(temp);

            for(int j =0; j < myString.length(); j++)
            {
                if (myString.charAt(j) == Character.forDigit(digit,10))
                {
                    x++;
                }
            }
        }
        return x;
    }
}
