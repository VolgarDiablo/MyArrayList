import java.util.Arrays;

// <L>?!
public class MyArrayList<L> {
    private Object[] array;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(Object element) {
        array[size++] = element;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public int size() {
        return size;
    }
}
