package oops6_generics;

import java.util.Arrays;

public class CustomGen_ArrayList<T> {
    private Object data[];
    static int default_size = 10;
    int size = 0;

    public CustomGen_ArrayList() {
        this.data = new Object[default_size];
    }

    //add method
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    //remove
    public T remove() {
        T removed = (T) (data[--size]); //type cast
        return removed;
    }

    public T get(int index) {

        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGen_ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGen_ArrayList<Float> list = new CustomGen_ArrayList<>();
        list.add(2.8f);
        /*
         String obj = new Integer();

         Jo left side wala part hota h, wo compile time pe ho check karta h, that the object belongs to
         me(the ref. variable which is of type Object Class/Parent Class/Interface) or not.
         During Declaration(Compile time), T is replaced by the <generic> type.
         So, static type checking can be done based upon the T that got replaced

         After compilation, the information about the generics is erased by type erasure done by java.
         That is why, T obj = new T(); cannot be valid.
        */

        Hello obj = new Hello();
        System.out.println();

        Object object = new String(); // possible
        for (int i = 1; i < 10; i++) {
            list.add(i*3/5f);
        }
        System.out.println(list);

    }
}

class Hello<E>{
    public E fun(E num){
        return num;
    }
}
