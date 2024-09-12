import java.util.*;
import java.util.stream.Collectors;

public class printstrings {
    
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonEmptyStrings);
    }
}

    

