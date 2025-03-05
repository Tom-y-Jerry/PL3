package es.ulpgc.dacd;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializeExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Objeto serializado: " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}