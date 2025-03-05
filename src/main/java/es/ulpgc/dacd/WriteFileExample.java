package es.ulpgc.dacd;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class WriteFileExample {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("output.txt");
        String content = "María\nJürgen\nÉmilie\n 李四";
        Files.writeString(filePath, content, StandardCharsets.UTF_8);
        //Leer archivo con UTF-8
        System.out.println("Contenido escrito en output.txt con UTF-8.");
        String contentUtf8 = Files.readString(filePath, Charset.forName("UTF-8"));
        System.out.println("Contenido (UTF-8):\n" + contentUtf8);
        // Leer archivo con ISO-8859-1
        String contentIso = Files.readString(filePath, Charset.forName("ISO8859-1"));
        System.out.println("Contenido (ISO-8859-1):\n" + contentIso);
        // Leer archivo con UTF-16LE
        String contentUtf16LE = Files.readString(filePath, Charset.forName("UTF-16LE"));
        System.out.println("Contenido (UTF-16LE):\n" + contentUtf16LE);
        // Leer archivo con UTF-16BE
        String contentUtf16BE = Files.readString(filePath, Charset.forName("UTF-16BE"));
        System.out.println("Contenido (UTF-16BE):\n" + contentUtf16BE);
    }
}
