//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        double shipPrice;
        double totalPrice;
        System.out.println("What is your price?");
        price = in.nextDouble();
        if (price >= 100){
            shipPrice = 0;
            totalPrice = price;
            System.out.println("Your total is " + price + " with free shipping.");
        }
        else {
            shipPrice = price * 0.02;
            totalPrice = shipPrice + price;
            System.out.println("Your total is " + totalPrice + " with a shipping cost of " + shipPrice + ".");
        }
    }
}