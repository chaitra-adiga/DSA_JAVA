package oops6_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Custom_ArrayList {
    private int[] data; //--- mera arraylist ka array jaha store hoga
    static int default_size =10;//initial size every time I create an object
    int size=0;//its working like an index

    public Custom_ArrayList() {

        this.data = new int[default_size]; //initially data array will be off default size
    }
    //add method + remove method
    public void add(int num ){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        //double the size
        int[] temp = new int[data.length*2];

        //copy the previous int new array
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    //remove
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index]= value;

    }

    @Override
    public String toString() {
        return "Custom_ArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.set(0,33);//set is only for existing index, it's only to  overwrite


        Custom_ArrayList list = new Custom_ArrayList();
        list.add(3);
        list.add(5);
        System.out.println(list);//if we didn't modify to-string it was printing it in object way
        System.out.println(list.remove());

//        for (int i = 0; i < 11; i++) {
//            list.add(i*2);
//        }
//        System.out.println(list);
    }
}
