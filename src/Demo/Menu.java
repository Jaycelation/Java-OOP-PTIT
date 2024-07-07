package Demo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLNV q = new QLNV();
        String fname = "src/Demo/nv.dat";
        while (true) {
            System.out.println("1. Nhap nhan vien");
            System.out.println("2. Hien thi nhan vien");
            System.out.println("3. Luu vao file");
            System.out.println("4. Doc tu file");
            System.out.println("0. Thoat");
            System.out.print("Moi chon (0-4): ");
            Scanner scanner = new Scanner(System.in);
            int chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                case 1:
                    q.input();
                    break;
                case 2:
                    q.show();
                    break;
                case 3:
                    q.save(fname);
                    break;
                case 4:
                    q.readFile(fname);
                    break;
                default:
                    System.out.println("Phai chon tu 0-4!");
                    break;
            }
        }
    }
}
