package es.ulpgc.dacd;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SerializeListToJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        try (FileWriter writer = new FileWriter("people.json")) {
            gson.toJson(people, writer);
            System.out.println("Lista serializada a JSON: " + gson.toJson(people));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
