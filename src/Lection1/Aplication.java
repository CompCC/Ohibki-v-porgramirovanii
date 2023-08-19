package Lection1;

import java.io.File;

public class Aplication {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("C:\\Users\\Comp\\Desktop\\Обучение\\Ohibki v porgramirovanii\\untitled\\src\\Lection1\\123.txt")));
        System.out.println(divide(-10,10));
    }

    public static int divide(int a1, int a2){
        if(a2==0){
            return -1;
        }
        return a1/a2;
    }

    public  static long getFileSize(File file){
        if(!file.exists()){
            return -1;
        }
        return file.length();
    }
}
