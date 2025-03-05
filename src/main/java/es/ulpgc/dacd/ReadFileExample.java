package es.ulpgc.dacd;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileExample {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("data.txt");
        // Leer archivo con UTF-8
        String contentUtf8 = Files.readString(filePath,
                Charset.forName("UTF-8"));
        System.out.println("Contenido (UTF-8):\n" + contentUtf8);
        // Leer archivo con ISO-8859-1
        String contentIso = Files.readString(filePath, Charset.forName("ISO8859-1"));
        System.out.println("Contenido (ISO-8859-1):\n" + contentIso);
    }

}
