package model;
import java.util.Scanner;

public class QlyNhanVien {
    private NhanVien [] nv;
    private int n;
    public QlyNhanVien () {
        nv = new NhanVien[100];
        n = 0;
    }
    private int check(int id) {
        for (int i = 0; i < n; ++i) {
            if (nv[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double income;
        //id: AB123
        while (true) {
            System.out.print("Enter Id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (check(id) == -1) {
                break;
            }
            System.out.print("Enter again!");
        }
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Income: ");
        income = Double.parseDouble(scanner.nextLine());

        nv[n++] = new NhanVien(id, name, income);
    }
    private void output() {
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < n; ++i) {
            System.out.println(nv[i]);
        }
        System.out.println("___________________");
    }
    public void SapXep() {
        System.out.println("Danh sach sau khi sap xep theo thu nhap:");
        for (int i = 0; i < n-1; ++i) {
            for (int j = i+1; j < n; ++j) {
                if (nv[i].getIncome() > nv[j].getIncome()) {
                    NhanVien temp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = temp;
                }
            }
            output();
        }
    }
}
