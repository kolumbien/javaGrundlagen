package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Serializable s = getData("hello", new ArrayList<>());
 *
 * String und ArrayList implementieren die Schnittstelle Serializable
 *
 * Type inference tries to find the most specific type that works with all of the arguments
 */

public class TypeInference {

    public static void test(){
        //not neccessary to write String in Arrylist
        List<String> list = new ArrayList<>();
    }

    static <T> List<T> add(List<T> list, T item1, T item2){
        list.add(item1);
        list.add(item2);
        return list;
    }

    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T>  bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " added to the list");
    }

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();

        //aqui lo hace con type inference
        TypeInference.addStore("Adam", list);

        //type "witness": le decimos al compiler que no haga el type inference, que son String
        TypeInference.<String>addStore("Daniel", list);

        List<Integer> list1 = add(new ArrayList<>(),20,30);
        System.out.println(list1);

    }
}

class Bucket<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(final T item) {
        this.item = item;
    }
}
