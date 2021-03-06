package generics;

class Person implements Comparable<Person>{

    private int age;

    public Person(final int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(final Person o) {
        return Integer.compare(age,o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}


public class BoundedGeneric {




    public static <T extends Number> double add(T num1, T num2){
        double result = num1.doubleValue() + num2.doubleValue();

        return result;
    }

    public static <T extends Comparable<T> > T calculateMin(T num1, T num2){
         if(num1.compareTo(num2) < 0){
             return num1;
         }

         return num2;
    }

    public static void main(String[] args) {
        System.out.println(calculateMin("kevin", "Ana"));
        System.out.println(calculateMin(10, 30));
        System.out.println(calculateMin(new Person(23), new Person(33)));
    }

}