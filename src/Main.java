import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("!");
        MyArrayList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < 10; i++) list.add(i);
        System.out.println(list);
        System.out.println("size: " + list.size() + "\n");

        list.add(10);
        System.out.println(list.get(10));
        System.out.println(list);
        System.out.println(list.remove(5) + "\n");

        System.out.println(list);

        list.clear();
        System.out.println("clear: " + list);

    }
}