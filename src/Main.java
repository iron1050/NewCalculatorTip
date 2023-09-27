
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
        System.out.print("Enter the percent tip that you want to give: ");
        // get the percentage of tip that you want to give
        double tipPercentage = scan.nextDouble();
        tipPercentage/= 100;
        tipPercentage += 1;
        double totalWithTip = subTotal * tipPercentage;
        double perPersonTotal = totalWithTip / numberPeople;
        totalWithTip = Math.round(totalWithTip * 100.0) / 100.0; // rounding the numbers to 2 decimal places (I learned this way of rounding from stackoverflow)
        perPersonTotal = Math.round(perPersonTotal * 100.0) / 100.0;
        System.out.println();
        System.out.println("Your total bill is: " + totalWithTip);
        System.out.print("Each person should pay: " + perPersonTotal);
    }
}