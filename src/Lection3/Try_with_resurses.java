package Lection3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Try_with_resurses {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("C:\\Users\\Comp\\Desktop\\Обучение\\Ohibki v porgramirovanii\\.gitignore");
             FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }

        } catch (RuntimeException | IOException e) { //перечисление нескольких эксепшенов в одном блоке catch
            System.out.println("cath exeption:" + e.getClass().getSimpleName());
        }
        try {
            System.out.println("test operation");
        } finally {
            System.out.println("finally operation");
        }
    }
}
