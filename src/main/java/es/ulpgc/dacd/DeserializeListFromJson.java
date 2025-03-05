package es.ulpgc.dacd;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class DeserializeListFromJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>() {}.getType();

        try (FileReader reader = new FileReader("people.json")) {
            List<Person> people = gson.fromJson(reader, listType);
            System.out.println("Lista deserializada desde JSON: " + people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
