package annotation;

import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {
        Class<Person> personClass = null;

        try {
            personClass = (Class<Person>) Class.forName("annotation.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Method[] methods =personClass.getMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println(method.getName());
            }
        }
    }
}
