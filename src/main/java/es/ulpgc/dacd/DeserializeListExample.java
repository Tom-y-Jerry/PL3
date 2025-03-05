package es.ulpgc.dacd;
import java.io.*;
import java.util.List;
public class DeserializeListExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("people.ser"))) {
            List<Person> people = (List<Person>) ois.readObject();
            System.out.println("Lista deserializada: " + people);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}