import java.awt.print.Pageable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargestInteger {

    //Write Java code in the given an array [23,17,19,13,98,76,27,31], find the maximum of two large integers?
    //Rate Limiter?
    //student subject
    //Patch in http methods
    //service discovery
    //

    public static void main (String str[]) {
       List<Integer> list =  Arrays.asList(1,2,3,4,5);
       String s = "karan";
       Map<Character, Long> map =s.chars().mapToObj(e -> (char)(e))
                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> list1 = Arrays.asList("karan", "babu");

       Map<Character, Long> list2 = list1.stream().flatMap(e -> e.chars().mapToObj(e1 -> (char)e1))

               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(list2);
    }

}
