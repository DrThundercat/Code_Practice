package Practice.problem8;

import java.util.*;

public class Kata8 {

    public static String orderWeight(String s)
    {
        HashMap<Integer,ArrayList<String> > weighted = new HashMap<>();
        int weight = 0;
        ArrayList<String> myString;
        List<Integer> myWeights = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        if(s == null || s.isEmpty() || s.startsWith(" "))
        {
            return s;
        }

        for(String val: s.split(" "))
        {
            myString = new ArrayList<>();
            myString.add(val);
            for(int i =0; i < val.length(); i++)
            {
                weight = Integer.parseInt(String.valueOf(val.charAt(i))) + weight;
            }

            if(!weighted.containsKey(weight))
            {
                weighted.put(weight,myString);
            }
            else
            {
                weighted.get(weight).add(val);

                Collections.sort(weighted.get(weight), new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {

                        return o1.compareTo(o2);
                    }
                });
            }

            weight = 0;

        }

        for(Integer key: weighted.keySet())
        {
            myWeights.add(key);
        }

        Collections.sort(myWeights);

        for(int j =0; j < myWeights.size();j++) {

            for (int i = 0; i < weighted.get(myWeights.get(j)).size(); i++) {

                if (j == myWeights.size() - 1 && weighted.get(myWeights.get(j)).size() == 1 ||
                        j == myWeights.size() - 1 && weighted.get(myWeights.get(j)).size() -1 == i  ) {
                    result.append(weighted.get(myWeights.get(j)).get(i));
                }
                else {
                    result.append(weighted.get(myWeights.get(j)).get(i) + " ");
                }
            }
        }

        return result.toString();
    }
}
