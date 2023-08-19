package Lection1;

public class Aplication2 {
    public static void main(String[] args) {
        divide(10,0);

    }
    public static int divide(int a1,int a2){
        if (a2==0){
            throw new RuntimeException("Деление на 0 невозможно");
        }
        return a1/a2;
    }
}
