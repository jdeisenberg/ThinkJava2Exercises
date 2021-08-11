import java.util.Scanner;

public class BadClose {
    
    public static double getPrice(String prompt) {
        Scanner input = new Scanner(System.in);
        double price;
        do {
            System.out.print(prompt);
            price = input.nextDouble();
            if (price <= 0) {
                System.out.println("Price must be greater than zero.");
            }
        } while (price <= 0);
        input.close();
        return price;
    }

        
    public static void main(String[] args) {
        double originalPrice = getPrice("Enter original price: ");
        double newPrice = getPrice("Enter new price: ");
        double pctChange = 100.0 *
          (newPrice - originalPrice) / originalPrice;
        System.out.printf("Price change: %.1f%%\n", pctChange);
    }
}
