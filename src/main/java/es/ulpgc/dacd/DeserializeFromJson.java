package es.ulpgc.dacd;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class DeserializeFromJson {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("person.json")) {
            Person person = gson.fromJson(reader, Person.class);
            System.out.println("Objeto deserializado desde JSON: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
