package Practice.Problem1;

class Kata {


    static String remove(String s, int n) {
        StringBuilder myString = new StringBuilder(s);
        int count = 0;
        int index;

        while( count < n )
        {
            index = myString.indexOf("!");
            if(index == -1)
            {
                break;
            }
            myString.deleteCharAt(index);
            count ++;
        }
        return myString.toString();
    }
}
