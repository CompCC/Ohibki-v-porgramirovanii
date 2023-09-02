package Lection2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checked_unchecket {
    public static void main(String[] args) {
        FileReader test = null;

        try {   // обязательная проверка исключения
            test = new FileReader("C:\\Users\\Comp\\Desktop\\Обучение\\Ohibki v porgramirovanii\\.gitignore");
            test.read();
        } catch (RuntimeException | IOException e) { //перечисление нескольких эксепшенов в одном блоке catch
            System.out.println("cath exeption:" + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exeption while close");
                }
            }
            System.out.println("finally finished");
        }

    }
}
