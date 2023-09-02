package Lection2;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length()); //NullPointerExeption -обращение к несущесвующему объекту

//        Object object = new String("123");
//        File file = (File) object; //кастуем объект object к классу File
//        System.out.println(file); //ClassCastExeption - объект типа Sring не может быть преобразован к объекту типа File

//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result); //NumberFormatExeption -ошибка преобразования строки в число

        List<Object> empltyList = Collections.emptyList(); //у калсса Colletions есть метод emptyList, который возвращает пустой лист при этом заблокированный для модификации
        empltyList.add(new Object()); //UnsupportedOperationExeption - метод на текущий момент для текущего объекта не поддерживается






























    }
}
