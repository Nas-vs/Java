import java.util.ArrayList;

public class SortedArray {

    private Person[] array;
    private int size;

    public SortedArray() {
        this.array = new Person[0];
        this.size = 0;
    }

    public void add(Person person) {
        Person[] newArray = new Person[size + 1];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        newArray[size] = person;
        array = newArray;
        size++;
    }

    public Person[] getArray() {
        return array;
    }

    public void setArray(Person[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
