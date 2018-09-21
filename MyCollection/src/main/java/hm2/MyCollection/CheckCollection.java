package hm2.MyCollection;

import java.util.ArrayList;
import java.util.List;

public class CheckCollection {
    public static void main(String[] args) {
        List list=new ArrayList();
       MyArrayList myArrayList=new MyArrayList();
        myArrayList.addAll(Utils.generateList(5));
        myArrayList.sort(myArrayList,Utils.comparator);
        System.out.println(myArrayList.get(0));

    }
}
