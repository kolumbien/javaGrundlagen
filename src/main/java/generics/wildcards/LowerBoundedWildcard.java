package generics.wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard
{
    /*
    * Insert items into a generic data structure or collection
    * printAll(List<? super T> accepts a list of any superclass of T
    *
    * cannot read items from List<? super T> because not guarantee what list is pointing to
    * we can read Objects exclusivly
    *
    * we can insert subtypes of T into a List<? super T>
    *
    * */
    public static void showAll(List<? super Number> list){
       /*
        Error porque no sabemos q tipo es
        for(Number n: list){
            System.out.println(n);
        }*/

        for(Object n: list){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<? super Integer> l1 = new ArrayList<>();
        List<? super Integer> l2 = new ArrayList<Number>();
        List<? super Integer> l3 = new ArrayList<Object>();

        // reading
        List<Serializable> list = new ArrayList<>();
        list.add("ad");
        list.add("bc");
        showAll(list); //porque Serializable es padre de Number

        List<? super  Number> nums = new ArrayList<Number>();
        nums.add(3); //integer su super es Number
        nums.add(3.3); //double su super es Number
        nums.add(8.9f); //float su super es Number

    }
}

