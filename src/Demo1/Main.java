package Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
//
//        c.add(new Integer(1234));
//        c.add("Dang Duc Tai");
//        c.add(new NhanVien("VT100101", "Dang Duc Tai", 12));
//        System.out.println(c);
//
//        Iterator i = c.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add("Ha Noi");
        list.add(78);
        list.add(1, "Insert 1");
        list.add("Ha Noi");
        System.out.println(list);
        int idx = list.indexOf("Ha Noi");
        System.out.println(idx);
        System.out.println(list.lastIndexOf("Ha Noi"));
        list.remove(new Integer(78));
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        list.set(0, new NhanVien("VT1821", "Jayce", 80));
        System.out.println(list);
    }
}
