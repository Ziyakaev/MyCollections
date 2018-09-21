package hm2.MyCollection;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class MyArrayList<T> implements List<T>{
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
        throw new RuntimeException("not realised");
     //   return false;
    }

    public Iterator<T> iterator() {
        throw new RuntimeException("not realised");
      //  return null;
    }

    public Object[] toArray() {

        return Arrays.copyOf(elementdata,size);
    }

    public <T1> T1[] toArray(T1[] a) {
        throw new RuntimeException("not realised");
      //  return null;
    }

    public boolean add(T t) {
        throw new RuntimeException("not realised");
      //  return false;
    }

    public boolean remove(Object o) {
        throw new RuntimeException("not realised");
      //  return false;
    }

    public boolean containsAll(Collection<?> c) {
        throw new RuntimeException("not realised");
       // return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        Object[] a=c.toArray();
        int numC=c.size();
        procuringCapacity(size+numC);
        System.arraycopy(a,0,elementdata,size,size+numC);
        size+=numC;
        return numC!=0;
    }
    public static <T> void copy(List<T> list,Comparator<? super T> c){

    }

    public void sort(List<T> list,Comparator<? super T> c){
    list.sort(c);
    }
    private void procuringCapacity(int capacity){
        if (capacity>elementdata.length){growUpCapactiy(calculateCapacity(elementdata,capacity));}
    }
    private static int calculateCapacity(Object[] elementdata,int capacity){
        return elementdata==EMPTY_ELEMENT_DATA?defaultCapacity:Math.max(defaultCapacity,capacity);
    }
    private void growUpCapactiy(int capacity){
        int oldElementDataLength=elementdata.length;
        int newElementDataLength=oldElementDataLength+oldElementDataLength>>1;
        if (newElementDataLength-capacity<0) {
            newElementDataLength=capacity;
        }
            elementdata=Arrays.copyOf(elementdata,newElementDataLength);

    }

    public boolean addAll(int index, Collection<? extends T> c) {
        throw new RuntimeException("not realised");
     //   return false;
    }

    public boolean removeAll(Collection<?> c) {
        throw new RuntimeException("not realised");
      //  return false;
    }

    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException("not realised");
      //  return false;
    }

    public void clear() {
        throw new RuntimeException("not realised");
    }

    public T get(int index) {
        return(T) elementdata[index];
    }

    public T set(int index, T element) {
        throw new RuntimeException("not realised");
       // return null;
    }

    public void add(int index, T element) {
        throw new RuntimeException("not realised");
    }

    public T remove(int index) {
        throw new RuntimeException("not realised");
     //   return null;
    }

    public int indexOf(Object o) {
        throw new RuntimeException("not realised");
      //  return 0;
    }

    public int lastIndexOf(Object o) {
        throw new RuntimeException("not realised");
       // return 0;
    }

    public ListIterator<T> listIterator() {
       return new ListItr(0);
    }
    private class ListItr extends Itr implements ListIterator<T>{

      public ListItr(int index){
          super();
          cursor=index;
      }

        @Override
        public boolean hasPrevious() {
            return cursor!=0;
        }

        @Override
        public T previous() {
          int i=cursor-1;
          Object[] elementData=MyArrayList.this.elementdata;
            return (T)elementData[i];
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor-1;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }
    }

    public ListIterator<T> listIterator(int index) {
        throw new RuntimeException("not realised");
      //  return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        throw new RuntimeException("not realised");
       // return null;
    }
    private class Itr implements Iterator<T> {
        int cursor;
        @Override
        public boolean hasNext() {
            return cursor!=size;
        }

        @Override
        public T next() {
            Object [] element=MyArrayList.this.elementdata;

            return(T) element[cursor];
        }
    }
}
