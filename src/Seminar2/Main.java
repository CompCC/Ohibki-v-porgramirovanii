package Seminar2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {               // checket exception (обязательная обработка)
            System.out.println("File not found: " + e.getMessage());
        }
        int[] numbers = {1, 2, 3};
        int result = numbers[5]; //выход за пределы массива (unchecked exception) не обязательная обработка
    }
}
