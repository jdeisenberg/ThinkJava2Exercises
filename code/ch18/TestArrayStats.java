public class TestArrayStats {
    
    public static void main(String[] args) {
        double[] items = new double[0];
        double result = ArrayStats.average(items);
        System.out.println("Average is " + result);
    }
}
