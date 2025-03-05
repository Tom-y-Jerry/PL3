package es.ulpgc.dacd;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializeExample {
    public static void main(String[] args) {
    try (ObjectInputStream ois = new ObjectInputStream(new
            FileInputStream("person.ser"))) {
        Person person = (Person) ois.readObject();
        System.out.println("Objeto deserializado: " + person);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}