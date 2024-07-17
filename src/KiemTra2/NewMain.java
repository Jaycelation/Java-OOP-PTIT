package KiemTra2;

import KiemTra2.Controller.QLPT;

import java.util.ArrayList;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        QLPT car = new QLPT();
        List<PTGT> q = car.readFile("src/KiemTra2/Controller/testcase.txt");
        for (PTGT i : q) {
            System.out.println(i);
        }
    }

}
