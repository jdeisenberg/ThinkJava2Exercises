import java.util.Scanner;

public class GeneralInput2 {
    
    public static double getPrice(Scanner in, String prompt) {
        double price;
        do {
            System.out.print(prompt);
            price = in.nextDouble();
            if (price <= 0) {
                System.out.println("Price must be greater than zero.");
            }
        } while (price <= 0);
        return price;
    }

        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double originalPrice = getPrice(input, "Enter original price: ");
        double newPrice = getPrice(input, "Enter new price: ");
        double pctChange = 100.0 *
          (newPrice - originalPrice) / originalPrice;
        System.out.printf("Price change: %.1f%%\n", pctChange);
        input.close();
    }
}
