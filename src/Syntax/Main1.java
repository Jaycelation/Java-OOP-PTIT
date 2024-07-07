package Syntax;

import java.util.Scanner;

public class Main1 {
    private static void xuLy(String s) throws StringIndexOutOfBoundsException{
        System.out.println(s.substring(50));
    }

    private static void recall(String s) {
        try {
            xuLy(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String re = "\\d+";
        int number;
        while (true) {
            try {
                System.out.print("Enter a number: ");
                String so = scanner.nextLine();
                if (so.matches(re)) {
                    number = Integer.parseInt(so);
                    break;
                } throw new SoException("Enter a number again!");
            } catch (SoException e) {
                System.err.println(e);
            }
        }
        System.out.println("So: " + number + "\n");

        String re1 = "^B\\d{2}";
        String id;
        while (true) {
            try {
                System.out.print("Enter Id: ");
                id = scanner.nextLine().toUpperCase();
                if (id.matches(re1)) {
                    break;
                } throw new MaException("Nhap theo dinh dang B12!");
            } catch (MaException e) {
                System.err.println(e);
            }
        }
        System.out.print("Id: " + id + "\n");

        //Mot trong 3 (trong main / recall / xuLy phai co xu ly ngoai le
        String s = "Nam thang ay!";
        recall(s);

    }
}
