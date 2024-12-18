import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        String s = "aaertyuujk";

        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
