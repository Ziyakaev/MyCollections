package hm2.MyCollection;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List generateList(int n){
        List list=new ArrayList();
        for (int i=0;i<n;i++){
            list.add(i);
        }
        return list;
    }
}
