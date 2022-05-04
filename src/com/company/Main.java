
import java.util.ArrayList;
import java.util.Scanner;

public class Task19_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите тип массива");
        String type = s.next();
        System.out.println("Длина массива:");
        int length = s.nextInt();

        if (type.equals("Integer")) {
            Integer[] integers = new Integer[length];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < length; i++) {
                integers[i] = s.nextInt();
            }
            System.out.println("Введите key: ");
            int key = s.nextInt();
            Comparable otv = linearSearch(integers, key);
            System.out.println(otv);

        }else if(type.equals("String")){
            String[] strings = new String[length];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < length; i++) {
                strings[i] = s.next();
            }
            System.out.println("Введите key: ");
            String key = s.next();
            Comparable otv = linearSearch(strings, key);
            System.out.println(otv);

        }
    }
    
    public static <Т extends Comparable<Т>> int linearSearch(Т[] list, Т key) {
        for (int i = 0; i < list.length; i++) {
            if (key.compareTo(list[i]) == 0)
                return i;
        }
        return -1;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task19_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int l = s.nextInt();
        ArrayList list = new ArrayList();
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < l; i++){
            list.add(s.next());
        }
        Comparable res = max(list);
        System.out.println("Максимальный элемент: " + res);

    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        return Collections.max(list);
    }
}
