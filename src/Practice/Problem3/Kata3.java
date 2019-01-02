package Practice.Problem3;

public class Kata3 {

    public static int avg_speed(double [] avg_distances)
    {
        int average = 0;
        for(double d: avg_distances)
        {
            if((int)d > average)
            {
                average = (int)d;
            }
        }
        return average;
    }

    public static double[] calculate_sections(double [] distance, int time) {
        double temp, temp1;
        double[] result;

        System.out.println(" array size is: " + distance.length);

        if(distance.length <= 0)
        {
            return result = new double[]{0.0};
        }

        result = new double[distance.length - 1];
        for (int i = 0; i < distance.length; i++) {
            if (i != distance.length - 1) {
                temp = distance[i];
                temp1 = distance[i + 1];

                result[i] = (3600 * (temp1 - temp) / time);
            }
        }
        return result;
    }
}
