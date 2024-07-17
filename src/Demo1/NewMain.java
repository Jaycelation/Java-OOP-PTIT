package Demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        List<NhanVien> list = new ArrayList<>();
        list.add(new NhanVien("B7", "Thu Ha", 12.5));
        list.add(new NhanVien("B8", "Tuan Anh", 15.5));
        list.add(new NhanVien("B9", "Bui Hieu", 18.5));

        System.out.println("Cach 1:");
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }

        System.out.println("Cach 2:");
        for (NhanVien i : list) {
            System.out.println(i);
        }

        System.out.println("Cach 3:");
        list.forEach(i-> System.out.println(i));

        System.out.println("Cach 4:");
        list.forEach(i->{
            System.out.println(i);
        });

        System.out.println("Cach 5:");
        list.forEach(System.out::println);

        System.out.println("Cach 6:");
        for(Iterator<NhanVien> i = list.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println("Cach 7:");
        list.stream().forEach(System.out::println);

    }
}
