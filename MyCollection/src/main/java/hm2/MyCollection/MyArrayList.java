package hm2.MyCollection;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    private int size;
    transient Object elementdata[];
    private static final Object[] EMPTY_ELEMENT_DATA={};
    private  static final int defaultCapacity=10;

    public MyArrayList(){
        elementdata=EMPTY_ELEMENT_DATA;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size!=0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean add(T t) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        Object[] a=c.toArray();
        int numC=c.size();
        procuringCapacity(size+numC);
        System.arraycopy(a,0,elementdata,size,size+numC);
        size+=numC;
        return false;
    }
    private void procuringCapacity(int capacity){
        if (capacity>elementdata.length){growUpCapactiy(calculateCapacity(elementdata,capacity));}
    }
    private static int calculateCapacity(Object[] elementdata,int capacity){
        return elementdata==EMPTY_ELEMENT_DATA?defaultCapacity:Math.max(defaultCapacity,capacity);
    }
    private void growUpCapactiy(int capacity){
        int oldElementDataLength=elementdata.length;
        int newElementDataLength=elementdata.length+elementdata.length>>1;
        if (newElementDataLength-capacity<0) {
            newElementDataLength=capacity;
        }
            elementdata=Arrays.copyOf(elementdata,newElementDataLength);

    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {

    }

    public T remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
