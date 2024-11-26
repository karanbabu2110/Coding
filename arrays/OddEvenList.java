package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(25);
        list.add(40);
        list.add(33);
        list.add(4);

        List<Integer> evenList = list.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
