package Seminar2;

public class Throws {
    public static void main(String[] args) {
        try {
            // вызываем метод divide, который может сгенерироать исключение
            double result = divide(10,0);
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            // Обрабатываем исключение в вызывающем коде
            System.out.println("Exeption caught: " + e.getMessage());
        }

    }

    //метод divide объявляет, что он может сгенерировать исключение ArithmeticException
    public static double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            // Генерируем исключение в случае деления на ноль
            throw new ArithmeticException("Division by zero");
        }
        return (double) dividend / divisor;
    }
}
