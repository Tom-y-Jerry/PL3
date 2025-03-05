package es.ulpgc.dacd;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class SerializeToJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Alice", 30);

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);
            System.out.println("Objeto serializado a JSON: " + gson.toJson(person));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
