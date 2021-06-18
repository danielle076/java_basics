package K_DecisionMakingStatements.IfThenElse;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("What is the purchase amount?");
        double purchaseAmount = userInputScanner.nextDouble();

        String discount;

        if (purchaseAmount >= 300.01) {
            discount = "16";
            purchaseAmount = purchaseAmount - purchaseAmount * 0.16;
        } else if (purchaseAmount >= 75) {
            discount = "10";
            purchaseAmount = purchaseAmount - purchaseAmount * 0.10;
        } else {
            discount = "0";
        }
        System.out.println("The customer gets " + discount + "% discount. The purchase amount is now: " + purchaseAmount);
    }
}
