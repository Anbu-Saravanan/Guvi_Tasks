package Task5.emptyString;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyOrNotStringT2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc","","bc","efg","abcd","jkl");
       List< String> printString = stringList.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Non Empty String List is: "+printString);
    }
}
