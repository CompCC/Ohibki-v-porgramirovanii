//Задача3: - по желанию
//        Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
//
//        Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
//        Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
//        Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
//        Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//        В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
//        - необходимо создать 3 класса собвстенных исключений

package HomeWorkSem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.print("Введите третье число: ");
            int number3 = scanner.nextInt();
            checkNumber(number1, number2, number3);
        } catch (InputMismatchException e) {
            System.out.println("Нужно вводить только число!");
        } catch (NumberSumException e) {
            System.out.println(e.getMessage());
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void checkNumber(int number1, int number2, int number3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        } else if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        } else if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        } else if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}