package es.ulpgc.dacd;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class WriteFileExample {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("output.txt");
        String content = "María\nJürgen\nÉmilie\n 李四";
        Files.writeString(filePath, content, StandardCharsets.UTF_8);
        System.out.println("Contenido escrito en output.txt con UTF-8.");
    }
}
