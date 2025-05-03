package Task5.map;

import java.util.stream.Stream;

public class UsingMapT1 {
    public static void main(String[] args) {
        Stream<String> name = Stream.of("aBc","d","f");
        name.map(String::toUpperCase).forEach(System.out::println);

        //Using List Interface
        /*List<String> names = Arrays.asList("aBc","d","f");
        names.stream().map(String::toUpperCase).forEach(System.out::println);*/

    }
}
