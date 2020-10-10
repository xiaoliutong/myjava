package base.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 刘壮壮
 */
public class SystemArrayCopySample {
    static transient   Object[] array = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {

        System.arraycopy(array, 2, array, 1, array.length-2);
        //array[array.length-1] = null;
        System.out.println(Arrays.toString(Arrays.copyOf(array,array.length-1)));

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
