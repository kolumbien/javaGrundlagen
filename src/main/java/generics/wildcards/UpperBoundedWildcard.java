package generics.wildcards;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<>();
       // list1.add(new Integer(12));errroorrr
    }

}
