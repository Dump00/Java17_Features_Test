package demo01;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var age = 12;
        var greet = "hello world";
        var list = new ArrayList<Integer>(List.of(1,2,3,4,5));
        System.out.println(age);
        System.out.println(greet);
        list.forEach(System.out::println);
    }
}
