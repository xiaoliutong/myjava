package base.collection.set;

import java.util.LinkedHashSet;

/*
 *  基于LinkHashMap 实现 LinkHashMap基于HashMap实现
 *     按照插入顺序排序
 *
 * */
public class MyLinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet);

    }

}
