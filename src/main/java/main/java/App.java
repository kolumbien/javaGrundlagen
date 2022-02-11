package main.java;

import generics.GenericMethod;

public class App {

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.showItem("hola");
        method.printItems(12,false);

        method.showItem(12);
        method.showItem(true);
        method.showItem(12.9);
        method.showItem('a');

        //int[] nums = {1,2,3,4}; no funciona con primitve typess
        Integer[] nums = {1,2,3,4};
        String names[] = {"Ana", "maria"};
        method.showItems(nums);
        method.showItems(names);
    }
}
