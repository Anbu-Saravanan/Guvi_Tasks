package AssignmentPurpose.Task1;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        int discountAmount = 0;
        int finalPrice =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your purchase amount to calculate discount");
        int purchaseAmount = scan.nextInt();
        if (purchaseAmount <= 500) {
            System.out.println("No discount amount is applied");
        } else if (purchaseAmount > 500 && purchaseAmount <= 1000) {
            discountAmount=(purchaseAmount *10) /100;
            finalPrice = purchaseAmount - discountAmount;
            System.out.println("10% discount applied.");
            System.out.println("Your final amount is "+ finalPrice);

        } else if (purchaseAmount >=1000) {
            discountAmount = (purchaseAmount *20)/100;
            finalPrice = purchaseAmount -discountAmount;
            System.out.println("20% discount applied.");
            System.out.println("Your final amount of above 1000 is "+ finalPrice);

        }



    }
}
