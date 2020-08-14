import org.apache.commons.lang.time.DateUtils;

import java.awt.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>();
//        list.add(null);
//
//        for (Object o : list) {
//            System.out.println(o);
//        }
//
//        List<Long> longList = Arrays.asList(1l, 2l, 2l, 3l);
//        System.out.println(longList.size());
//
//        System.out.println(new HashSet<>(longList).size());

//        Calendar date = Calendar.getInstance();
//        date.set(2020, 2, 26);
//        Calendar date2 = Calendar.getInstance();
//        date2.set(2020, 2, 1);
//        System.out.println(DateUtils.truncatedCompareTo(date, date2, Calendar.DAY_OF_MONTH) <= 0);
//
//        Long id = 5L;
//        System.out.println(null == id);
//-------------
//        System.out.println(BigDecimal.ZERO.setScale(2));
//        System.out.println(new BigDecimal("salut"));
//
//        System.out.println(null == Color.BLACK);
//
//        Long a = 1L;
//        System.out.println(a > 0);
//        ----------------------
        Integer[] table = new Integer[] {1, 256 ,3};
        System.out.println(Arrays.asList(table).contains(1));
        String[] strings = new String[] {"5628"};
        System.out.println(Arrays.asList(strings).contains(String.valueOf(5628)));

    }
}
