//Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с
//        сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
//
//        Обратите внимание, что в обоих задачах используются собственные исключения, которые
//        наследуются от класса Exception. Это позволяет нам определить специфическую причину ошибки
//        и передать информацию об ошибке для последующей обработки.


package HomeWorkSem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите делимое: ");
            int dividend = scanner.nextInt();
            System.out.print("Введите делитель: ");
            int divisor = scanner.nextInt();
            double result = divide(dividend, divisor);
            System.out.println("Результат: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить только число!");
        }
        scanner.close();
    }

    public static double divide(int dividend, int divisor) throws DivisionException {
        if (divisor == 0) {
            throw new DivisionException("Деление на ноль недопустимо");
        }
        return (double) dividend / divisor;
    }
}


class DivisionException extends Exception {
    public DivisionException(String message) {
        super((message));
    }
}
