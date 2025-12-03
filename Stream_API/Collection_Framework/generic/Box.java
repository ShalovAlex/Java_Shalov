package Collection_Framework.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public void add(T s){
        arrayList.add(s);
    }
}
