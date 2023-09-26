
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the subtotal of your bill: ");
        // get the subtotal of the bill, before tip
        double subTotal = scan.nextDouble();
        System.out.println();
        System.out.print("Enter the number of people who you are with, including yourself: ");
        // get the number of people that there are
        int numberPeople = scan.nextInt();
        System.out.println();
        System.out.println("Enter the percent tip that you want to give: ");
        // get the percentage of tip that you want to give
        double tipPercentage = scan.nextDouble();
    }
}