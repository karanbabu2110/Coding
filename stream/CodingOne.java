package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingOne {
    public static void main(String[] args) {
        List<Double> list = Stream.of("1","2","3","4","5","6").map(Double::parseDouble)
                .collect(Collectors.toList());
        double average = list.stream().collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println(average);
    }
}
