package reflection;

import java.lang.reflect.Method;

public class MethodExample
{

    public static void main(String[] args) {

        Class<Person> person = null;

        try {
            person = (Class<Person>) Class.forName("reflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //returns public methods, inclusive the Object methods
        Method[] methods = person.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        //return all methods of the class only
        Method[] methodsDeclared = person.getDeclaredMethods();

        for (Method method : methodsDeclared) {
            method.setAccessible(true);
            System.out.println("--> " +method);
        }

    }
}
