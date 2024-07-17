package Demo2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> list1 = IOFile.read("src/demo2/sv.txt");
        List<MatHang> list2 = IOFile.read("src/demo2/mh.txt");
        System.out.println("Danh sach sinh vien:");
        for (SinhVien i : list1) {
            System.out.println(i);
        }

        System.out.println("Danh sach mat hang");
        for (MatHang i : list2) {
            System.out.println(i);
        }
    }
}
