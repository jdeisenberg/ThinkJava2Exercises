import java.util.Scanner;

public class RepeatedCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double originalPrice;
        do {
            System.out.print("Enter original price: ");
            originalPrice = input.nextDouble();
            if (originalPrice <= 0) {
                System.out.println("Price must be greater than zero.");
            }
        } while (originalPrice <= 0);
        
        double newPrice;
        do {
            System.out.print("Enter new price: ");
            newPrice = input.nextDouble();
            if (newPrice <= 0) {
                System.out.println("Price must be greater than zero.");
            }
        } while (newPrice <= 0);
        
        double pctChange = 100.0 * (newPrice - originalPrice) / originalPrice;
        System.out.printf("Price change: %.1f%%\n", pctChange);
    }
}
