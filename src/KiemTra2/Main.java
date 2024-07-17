package KiemTra2;

import KiemTra1.Matrix;
import KiemTra2.Controller.QLPT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPT q = new QLPT();
        String fname = "src/KiemTra2/Controller/ptgt.dat";
        while (true) {
            System.out.println("1. Nhap 1 phuong tien giao thong");
            System.out.println("2. Hien thi danh sach phuong tien giao thong");
            System.out.println("3. Luu vao file");
            System.out.println("4. Doc tu file");
            System.out.println("5. Tim kiem theo hang");
            System.out.println("6. Tim kiem theo mau");
            System.out.println("7. Tiem kiem theo gia tu ... den ...");
            System.out.println("8. Sua thong tin 1 phuong tien giao thong");
            System.out.println("9. Xoa 1 phuong tien giao thong");
            System.out.println("10. Sap xep phuong tien theo nam san xuat");
            System.out.println("11. Sap xep phuong tien theo hang");
            System.out.println("12. Sap xep phuong tien theo 2 thuoc tinh (Hang, gia)");
            System.out.println("0. Exit");
            System.out.print("Let pick (0-12): ");
            int choosen;
            Scanner scanner = new Scanner(System.in);
            choosen = Integer.parseInt(scanner.nextLine());
            switch (choosen) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1: q.input();
                    break;
                default:
                    System.out.println("Only pick in range(0, 9)");
                    break;
                case 2: q.output();
                    break;
                case 3: q.save(fname);
                    break;
                case 4: q.read(fname);
                    break;
                case 5: q.findBrand();
                    break;
                case 6: q.findColor();
                    break;
                case 7: q.findPrice();
                    break;
                case 8: q.fixed();
                    break;
                case 9: q.remove();
                    break;
                case 10: q.sortByYear();
                    break;
                case 11: q.sortByBrand();
                    break;
                case 12: q.sortByBrandxPrice();
                    break;
            }
        }
    }
}
