package Task5.CalculateDOB;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateBirthDate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Birth Year");
        String birthDate = scanner.nextLine();
        //Convert String to DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

       LocalDate dateTime = LocalDate.parse(birthDate,dateTimeFormatter);
        //System.out.println(dateTime);

        // Calculate age
        Period age = Period.between(dateTime,LocalDate.now());

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
    }
}
