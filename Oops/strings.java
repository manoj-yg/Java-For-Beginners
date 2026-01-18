
import java.util.*;

public class strings {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>(Arrays.asList(
                "apple", "banana", "computer", "java", "programming", "cloud"
        ));

        long count = strings.stream().filter(s -> s.length() > 6).count();

        System.out.println("Count: " + count);
    }
}
