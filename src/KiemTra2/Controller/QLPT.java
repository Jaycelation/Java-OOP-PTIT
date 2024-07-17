package KiemTra2.Controller;

import KiemTra2.PTGT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class QLPT {
    private List<PTGT> list;

    Scanner scanner = new Scanner(System.in);

    public void setList(List<PTGT> list) {
        this.list = list;
    }

    public QLPT() {
        list = new ArrayList<>();
    }
    //Check id trung
    private int viTri(String id) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
    //Nhap 1 phuong tien
    public void input() {
        String re = "^[AB]{1}\\d{4}";
        String id, brand, color;
        int year;
        double price;

        while (true) {
            try {
                System.out.print("Enter Id: ");
                id = scanner.nextLine().toUpperCase();
                if ((viTri(id) == -1) && id.matches(re)) {
                    break;
                } else throw new ValidException("Ma bi trung! hoac khong dung dinh dang!");
            } catch (ValidException e) {
                System.err.println(e);
            }
        }

        System.out.print("Enter brand name: ");
        brand = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter year: ");
                year = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap 4 so!");
            }
        }

        while (true) {
            try {
                System.out.print("Enter price: ");
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap 1 so thuc!");
            }
        }
        System.out.print("Enter color: ");
        color = scanner.nextLine();
        list.add(new PTGT(id, brand, year, price, color));
    }

    public void output() {
        System.out.println("Danh sach phuong tien giao thong: ");
        for (PTGT p : list) {
            System.out.println(p);
        }
        System.out.println("------------------------");
        System.out.println("Tong so: " + list.size());
    }

    public void save(String fname) {
        IOFile.write(fname, list);
    }
    public void read(String fname) {
        setList(IOFile.read(fname));
    }

    public void findBrand() {
        int t = 0;
        System.out.print("Nhap hang can tim: ");
        String key = scanner.nextLine();
        for (PTGT p : list) {
            if (p.getBrand().toLowerCase().indexOf(key.toLowerCase()) > 0) {
                System.out.println(p);
                ++t;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao!");
        }
    }

    public void findColor() {
        System.out.print("Nhap mau sac can tim: ");
        String key = scanner.nextLine();
        int t = 0;
        for (PTGT p : list) {
            if (p.getColor().toLowerCase().indexOf(key.toLowerCase()) >= 0) {
                System.out.println(p);
                ++t;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao!");
        }
    }

    public void findPrice() {
        int t = 0;
        double l, r;
        while (true) {
            try {
                System.out.print("Nhap gia tu ");
                l = Double.parseDouble(scanner.nextLine());
                System.out.print("den: ");
                r = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.err.println("Nhap vao gia la so!");
            }
        }
        for (PTGT p : list) {
            if (p.getPrice() >= l && p.getPrice() <= r) {
                System.out.println(p);
                ++t;
            }
        }
        if (t == 0) {
            System.out.println("Khong tim thay phuong tien nao!");
        }
    }

    public void remove() {
        System.out.print("Nhap vao ma phuong tien can xoa: ");
        String id = scanner.nextLine();

        int i = viTri(id);
        if (i == -1) {
            System.out.println("Khong tim thay phuong tien nao!");
        }
        else {
            PTGT p = list.remove(i);
            System.out.println(p);
        }
    }

    public void fixed() {
        System.out.print("Nhap vao ma phuong tien can sua: ");
        String vt = scanner.nextLine();

        int i = viTri(vt);
        if (i == -1) {
            System.out.println("Khong tim thay phuong tien nao!");
        }
        else {
            PTGT p = list.get(i);
            System.out.println("Nhap lai!");
            String re = "^[AB]{1}\\d{4}";
            String id, brand, color;
            int year;
            double price;

            while (true) {
                try {
                    System.out.print("Enter (new) Id: ");
                    id = scanner.nextLine().toUpperCase();
                    if ((viTri(id) == -1) && id.matches(re)) {
                        break;
                    } else throw new ValidException("Ma bi trung! hoac khong dung dinh dang!");
                } catch (ValidException e) {
                    System.err.println(e);
                }
            }

            System.out.print("Enter (new) brand name: ");
            brand = scanner.nextLine();

            while (true) {
                try {
                    System.out.print("Enter (new) year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Nhap 4 so!");
                }
            }

            while (true) {
                try {
                    System.out.print("Enter (new) price: ");
                    price = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Nhap 1 so thuc!");
                }
            }
            System.out.print("Enter (new) color: ");
            color = scanner.nextLine();
            p.setBrand(brand);
            p.setColor(color);
            p.setId(id);
            p.setYear(year);
            p.setPrice(price);
            System.out.println("Sua thanh cong!");
        }
    }

    public void sortByYear() {
        Collections.sort(list);
    }

    public void sortByBrand() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getBrand().compareToIgnoreCase(o2.getBrand()); //Tang dan
            }
        });
    }

    public void sortByBrandxPrice() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if (o1.getBrand().equalsIgnoreCase(o2.getBrand())) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
    }

    public List<PTGT> readFile(String fname) {
        List<PTGT> p = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = br.readLine()) != null) {
                String [] s = line.split(", ");
                String id = s[0];
                String brand = s[1];
                int year = Integer.parseInt(s[2]);
                double price = Double.parseDouble(s[3].replace(" USD", ""));
                String color = s[4];
                PTGT car = new PTGT(id, brand, year, price, color);
                p.add(car);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return p;
    }

}