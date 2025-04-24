package BranchingAndLooping;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter three numbers for comparison");
        int num1 = scan1.nextInt();
        int num2 = scan1.nextInt();
        int num3 = scan1.nextInt();
        if (num1 < num2 && num1<num3){
            System.out.println("First Number is smallest " + num1);
        }else if (num2 < num1 && num2< num3){
            System.out.println("Second number is smallest "+ num2);
        }
        else if(num3 < num1 && num3 < num2) {
            System.out.println("Third number is smallest " + num3);
        }else {
            System.out.println("U had entered same numbers");
        }
        }
    }
