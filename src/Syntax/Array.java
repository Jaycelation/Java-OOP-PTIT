package Syntax;
import java.util.Scanner;

public class Array {
    static Scanner scanner = new Scanner(System.in);
    private static int [] input(int n) {
        int [] a = new int[n];
        System.out.print("Nhap day so: ");
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        return a;
    }
    private static void output(int [] a) {
        System.out.print("Day so la: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static int sum(int ... a) {
        int temp = 0;
        for (int i : a) {
            temp += i;
        }
        return temp;
    }

    private static void write(Book ... books) {
        for (Book book : books) {
            System.out.print(book);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap vao so phan tu: ");
        n = scanner.nextInt();
        int [] a = input(n);
        output(a);
        System.out.println("Tong cua mang a la: " + sum(a));
        System.out.println("Tong cua danh sach la: " + sum(2, 5, 19, 2));
        write(new Book(1, "Giai tich 1"), new Book(2, "Giai tich 2"), new Book(3, "Giai tich 3"));
    }
}