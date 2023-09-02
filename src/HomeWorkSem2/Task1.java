//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
//        с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".


package HomeWorkSem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            checkNumber(number);

        } catch (InvalidNumberException e) {
            System.out.println("Некорректное число");
        } catch (InputMismatchException e1) {
            System.out.println("Нужно вводить только число!");
        }

        scanner.close();
    }

    public static void checkNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }

    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}