package generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {

    public static void print(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void print2(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer i = 23;
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<String> strs = Arrays.asList("ana","tola");
        //print(i); error
        //print(nums); error
        print2(nums);
        print2(strs);
    }
}
