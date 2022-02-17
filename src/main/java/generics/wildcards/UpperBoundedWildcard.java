package generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class UpperBoundedWildcard {

    /**
     * This method can accept a list of any subclass of T
     * @param mylist
     * @param <T>
     */
    public <T> void printAll(List<? extends T> mylist){

    }
    //
    // OJO!!!!
    // we can not ADD items into a wildcard list, because we dont know what type is there
    //but READ items yes we can
    public <T> void addItem(List<? extends Number> mylist){

    }

    public static double sumAll(List<? extends Number> list){
        double sum=0;

        for(Number n: list){
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void showAll(List<? extends Number> list){
        for(Number n: list){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
       /* List<? extends Number> list1 = new ArrayList<>();
        list1.add(new Integer(12));errroorrr no funciona
        cannot guarantee the list is pointing to
        porque podria add(integer) luego add(Double)*/

        //upper bounded wildcards, only read items, no add items
        List<? extends Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Double>();
        List<? extends Number> list3 = new ArrayList<Float>();

        showAll(list1);

        List<Integer> nums = new ArrayList<>();
        showAll(nums);

        showAll(Arrays.asList(1,2,3));


        //lower bounded wildcards
        List<? super Number> listLower = new ArrayList<>();
        listLower.add(new Integer(12));

    }

}
