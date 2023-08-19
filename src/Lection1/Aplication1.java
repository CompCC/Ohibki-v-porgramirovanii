package Lection1;

public class Aplication1 {
    public static void main(String[] args) {
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }
}
