import java.util.Scanner;
public class hw19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array type");
        String t = sc.next();
        System.out.println("array lendth:");
        int l = sc.nextInt();
        if (t.equals("Integer")) {
            Integer[] integers = new Integer[l];
            System.out.println("enter elenets array: ");
            for (int i = 0; i < l; i++) {
                integers[i] = sc.nextInt();
            }
            System.out.println("enter key: ");
            int key = sc.nextInt();
            Comparable abc = linearSearch(integers, key);
            System.out.println(abc);
        }
        else if(t.equals("String")){
            String[] strings = new String[l];
            System.out.println("enter elenets array: ");
            for (int i = 0; i < l; i++) {
                strings[i] = sc.next();
            }
            System.out.println("tnter key: ");
            String key = sc.next();
            Comparable abc = linearSearch(strings, key);
            System.out.println(abc);

        }
    }
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (key.compareTo(list[i]) == 0)
                return i;
        }
        return -1;
    }
}
