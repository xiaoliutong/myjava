package base.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 *  底层是HashMap 是无序的,不允许重复,只允许有一个null值。
 */
public class MyHashSet {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("14");
        set.add("24");
        set.add("33");

        System.out.println(set);
    }

}
