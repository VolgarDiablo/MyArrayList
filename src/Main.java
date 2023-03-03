import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < 10; i++) list.add(i);
        System.out.println(list);
        System.out.println("size: " + list.size() + "\n");

        list.add(10);

        list.get(10);
        System.out.println(list);
        list.remove(5);

        System.out.println(list);

        list.clear();
        System.out.println("clear: " + list);

    }
}