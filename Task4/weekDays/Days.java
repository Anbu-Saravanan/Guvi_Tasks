package StudentManagementSysem.weekDays;

import java.util.Scanner;

public class Days {
    static String[] days = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day position 0 to 6");
       int dayPosition = scanner.nextInt();

       try{
           System.out.println("U enter day position is " + dayPosition+" "+ days[dayPosition]);
       }catch (ArrayIndexOutOfBoundsException a){
           System.out.println("U entered beyond limits index"+a.getMessage());
       }




    }
}
