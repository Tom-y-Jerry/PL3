package es.ulpgc.dacd;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeListExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        try (ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("people.ser"))) {
            oos.writeObject(people);
            System.out.println("Lista serializada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


