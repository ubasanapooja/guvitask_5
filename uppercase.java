import java.util.stream.Stream;

public class uppercase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        names.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
