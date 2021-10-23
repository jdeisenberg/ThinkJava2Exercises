/*
 * This class contains methods useful for doing
 * statistics on an array of double values.
 */
 
public class ArrayStats {

    public static double mean(double[] data) {
        double sum = 0.0;
        for (double item: data) {
            sum += item;
        }
        int n = data.length;
        double result = 0.0;
        if (n > 0) {
            result = sum / n;
        }
        return result;
    }
    
    public static double stdv(double[] data) {
        double sum = 0.0;
        double sumOfSquares = 0.0;
        int n = data.length;
        double result = 0.0;
        
        if (n > 1) {
            for (double item: data) {
                sum += item;
                sumOfSquares += item * item;
            }
            result = Math.sqrt((n * sumOfSquares - sum * sum) / (n * (n - 1)));
        }
        return result;
    }
}
