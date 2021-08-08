public class ArrayStats {
  public static double average(double[] data) 
   throws IllegalArgumentException {
    int n = data.length;
    if (n > 0) {
      double sum = 0.0;
      for (double value: data) {
        sum += value;
      }
      return sum / n;
    } else {
      throw new IllegalArgumentException("Empty array");
    }
  }
}
