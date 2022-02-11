package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * Bounded type parameters
     * @param shapes
     */
    public static void drawAll( List<Shape> shapes){
        for(Shape shape:shapes){
            shape.draw();
        }
    }

    public static <T extends Shape> void drawAll2( List<T> shapes){
        for(T shape:shapes){
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> rectanles = new ArrayList<>();
        //drawAll(rectanles); error
        drawAll2(rectanles);
    }
}
