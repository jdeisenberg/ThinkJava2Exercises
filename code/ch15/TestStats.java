/*
 * This program will test the methods in ArrayStats.
 */

public class TestStats {

    public static void main(String[] args) {
        double [] values = {10.0, 47.0, 6.6, 505.0217, 11.0};
        double avg = ArrayStats.mean(values);
        double stdDev = ArrayStats.stdv(values);
        System.out.printf("Average: %.3f\n", avg);
        System.out.printf("Standard Deviation: %.3f\n", stdDev);
    }
}
