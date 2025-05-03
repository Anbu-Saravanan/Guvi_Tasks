package Task5.NameStartWithA;

import java.util.Arrays;
import java.util.List;

public class Student
{
    public static void main(String[] args) {
        List<String> studentName = Arrays.asList("Ajay","Akilan","Vija"
                ,"Santhosh","Dihvanth","Kavin","Jessica","Jenisha","Renuka","Jeeva");
        studentName.stream().filter(n -> n.startsWith("A"))
                .forEach(s -> System.out.println("Students name start with A: "+s));


    }
}
