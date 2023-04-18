//2. Напишите метод, который составит строку,состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения.
package dz2;
import java.io.*;
import java.util.Scanner;
public class MainClassDzTwo2 {
    public static void main(String[] args) {
        generateString();
    }

    public static void generateString() {
        try (FileWriter writer = new FileWriter ("list.txt", false)) {
            String text = "TEST";
            for (byte i = 0; i != 100; i++) {
                writer.write(text);
                System.out.println(text);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}