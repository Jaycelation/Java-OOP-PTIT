package Demo;

import java.io.*;
import java.util.Scanner;

public class QLNV {
    private NhanVien[] nhanViens;
    private int n;
    public QLNV() {
        nhanViens = new NhanVien[100];
        n = 0;
    }

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int checkId(String id) {
        for (int i = 0; i < n; ++i) {
            if (nhanViens[i].getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String id, name;
        double income = 0;

        String re = "^B\\d{2}";
        while (true) {
            System.out.print("Enter Id: ");
            try {
                id = scanner.nextLine().toUpperCase();
                if (id.matches(re) && checkId(id) == -1) {
                    break;
                }
                else {
                    throw new ValidException("Ma khong dung dinh dang / Trung ma!");
                }
            }  catch (ValidException exception) {
                System.out.println(exception);
            }
        }

        String reName = "[a-zA-z ]+";
        while (true) {
            System.out.print("Enter name: ");
            try {
                name = scanner.nextLine();
                if (name.matches(reName)) {
                    break;
                }
                else {
                    throw new ValidException("Ten khong dung dinh dang!");
                }
            } catch (ValidException exception) {
                System.out.println(exception);
            }
        }

        String reIncome = "[\\d.]";
        while (true) {
            System.out.print("Enter income: ");
            try {
                income = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.err.println("Nhap so!");
            }
        }
        nhanViens[n++] = new NhanVien(id, name, income);
    }
    public void readFile(String fname) {
        NhanVien [] nv = new NhanVien[100];
        int cnt = 0;
        String line;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fname)));
            while ((line = bf.readLine()) != null) {
                String [] s = line.split(";");
                nv[cnt++] = new NhanVien(s[0], s[1], Double.parseDouble(s[2]));
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        setN(cnt);
        setNhanViens(nv);
    }
    public void show() {
        System.out.println("Danh sach nhan vien");
        for (int i = 0; i < n; ++i) {
            System.out.println(nhanViens[i]);
        }
        System.out.println("--------------------------------");
    }
    public void save(String fname) {
        String st = "";
        for (int i = 0; i < n-1; ++i) {
            st += nhanViens[i].getId() + ";" + nhanViens[i].getName() + ";" + nhanViens[i].getIncome() + "\n";
        }
        st += nhanViens[n-1].getId() + ";" + nhanViens[n-1].getName() + ";" + nhanViens[n-1].getIncome();
        try {
            PrintWriter pt = new PrintWriter(fname);
            pt.print(st);
            pt.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}