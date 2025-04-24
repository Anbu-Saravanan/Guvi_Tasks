package BranchingAndLooping;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a series of number for reverse");
        int input = scan.nextInt();
         int reversed = 0;

         while ( input > 0){
             int digit = input % 10;
             reversed = reversed * 10+digit;
             input = input / 10;
         }
        System.out.println("Reversed Number: " + reversed);

    }
}
