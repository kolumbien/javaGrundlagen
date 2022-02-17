package generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Upper bounded wildcard (extends) only to GET values of a collection.
 * no es inmutable porque se puede add(null), or sort or delete
 *
 * lower bounded wildcrad (super) only to PUT values of a collection
 *
 * read and write: bounded type params
 *
 */

public class App {

    public static <T> void copy(List<? extends T> source, List<? super T> destination)
    {
        for (int i = 0; i < source.size(); i++) {
            destination.add(source.get(i));
        }
    }

    public static void drawAll( List<Shape> shapes){
        for(Shape shape:shapes){
            shape.draw();
        }
    }

    /**
     * -------Bounded type parameters approach------
     * @param shapes
     */
    public static <T extends Shape> void drawAll2( List<T> shapes){
        for(T shape:shapes){
            shape.draw();
        }
    }



    public static void main(String[] args) {
        List<Rectangle> rectanles = new ArrayList<>();
        //drawAll(rectanles); error
        drawAll2(rectanles);

        List<String> list = Arrays.asList("ana", "maria");
        List<String> list2 = new ArrayList<>();
        copy(list,list2);
        System.out.println(list2);
    }
}
