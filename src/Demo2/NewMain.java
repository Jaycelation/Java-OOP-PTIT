package Demo2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        List<SinhVien> listSv = new ArrayList<>();

        listSv.add(new SinhVien("B22DCAT251", "Dang Duc Tai", 9));
        listSv.add(new SinhVien("B22DCAT247", "Nguyen Thanh Son", 8));
        listSv.add(new SinhVien("B22DCAT156", "Hoang Van Huong", 8.5));
        IOFile.write("src/demo2/sv.txt", listSv);

        List<MatHang> listMh = new ArrayList<>();
        listMh.add(new MatHang(1, "PC Gaming", 10, 25599900));
        listMh.add(new MatHang(2, "Pencil 2B", 20, 5000));
        listMh.add(new MatHang(3, "Chuot khong day Xiaomi Mi Dual Mode Wireless", 15, 300000));
        IOFile.write("src/demo2/mh.txt", listMh);
        System.out.println("Done!");
    }
}
