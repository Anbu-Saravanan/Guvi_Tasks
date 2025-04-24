package AssignmentPurpose.Task1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers to check Positive or Negative");
        int input = scan.nextInt();

        if (input > 0) {

            System.out.println("Input number is Positive "+ input);
        }else if(input<0){
            System.out.println("Input number is Negative " + input);
        }else
            System.out.println("Input number is Zero "+ input);
    }
}
