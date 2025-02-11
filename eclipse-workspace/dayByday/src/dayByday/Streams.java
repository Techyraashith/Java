package dayByday;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

sealed class class1 permits Streams {
    String n = "Hey There!";
}

public non-sealed class Streams extends class1 {

    public static void main(String[] args) {
        System.out.println("This is Sealed class. Access only for Streams Class.");

        Streams s = new Streams();

        System.out.println(s.n);

        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        numbers.add(10);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(12);
        numbers.add(100);
        numbers.add(19);
        numbers.add(102);
        numbers.add(10);

        strings.add("Hey!");
        strings.add("Raashith");
        strings.add("Welcome To Java.");

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        
        String toUpper = strings.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(" "));

        
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println();
        System.out.println(toUpper);
    }
}
