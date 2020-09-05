import java.util.Arrays;

public class SDAArrayList<E> {

    private final static int DEFAULT_CAPACITY = 1;

    private E[] internalArray;
    private int index;

    public SDAArrayList() {
        internalArray = (E[]) new Object[DEFAULT_CAPACITY];
    }

    void add(E element) {
        if (index > internalArray.length - 1) {
            internalArray = Arrays.copyOf(internalArray, internalArray.length + 1);
        }
        internalArray[index] = element;
        System.out.println("Dodano element: " + internalArray[index]);
        index++;
        this.display();
    }

    E remove(int removeIndex) {
        E removedElement = internalArray[removeIndex];
        E[] tempInterialArray = (E[]) new Object[internalArray.length - 1];
        for (int i = removeIndex; i < internalArray.length - 1; i++) {
            tempInterialArray[i] = internalArray[i + 1];

        }
        for (int i = 0; i < removeIndex; i++) {
            tempInterialArray[i] = internalArray[i];

        }
        index--;
        System.out.println("Usunięto element: " + removedElement);
        internalArray = tempInterialArray;
        this.display();
        return removedElement;
    }

    E get(int index) {
        return internalArray[index];
    }

    void display() {
        System.out.println(Arrays.toString(internalArray));
    }
}
    class SDAArrayListService{
        public static void main(String[] args) {
            SDAArrayList <String> sdaArrayList = new SDAArrayList<String>();
            sdaArrayList.add("Element1");
            sdaArrayList.add("Element2");
            sdaArrayList.add("Element3");
            sdaArrayList.remove(1);


        }
    }

