package generics;

public class GenericMethod {

    public <T> void showItems(T[] items){
        for (T item :items) {
            System.out.println("the item is: " + item);

        }
    }

    public <T> void showItem(T item){
        System.out.println("the otem is: " + item);
    }

    public <T> T returnItem(T item){
        System.out.println("the otem is: " + item);
        return item;
    }

    public <T,V> void printItems(T t, V v){
        System.out.println("the T is: " + t);
        System.out.println("the V is: " + v);
    }
}
