package Syntax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareMatrix a = null;
        while (true) {
            System.out.println("1. Enter Square Matrix");
            System.out.println("2. Write the Square Matrix");
            System.out.println("3. Write the maximum of Row / Col");
            System.out.println("4. Write the transpose of Matrix");
            System.out.println("5. Check the Symmetric");
            System.out.println("6. Calculate determinant of the Matrix");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number about (0-6): ");
            int choosen = scanner.nextInt();
            switch (choosen){
                case 0:
                    System.out.println("Bye !!");
                    System.exit(0);
                    break;
                case 1:
                    int n;
                    System.out.print("Enter n: ");
                    n = scanner.nextInt();
                    a = new SquareMatrix(n);
                    a.input();
                    break;
                case 2:
                    a.output();
                    break;
                case 3:
                    a.getMaxSum();
                    break;
                case 4:
                    SquareMatrix b = new SquareMatrix(a.getSize());
                    b.setA(a.transpose());
                    a.output();
                    b.output();
                    break;
                case 5:
                    System.out.println((a.isSymmetric() ? "is Symmetric" : "is not Symmetric"));
                    break;
                case 6:
                    System.out.println("Det = " + a.detOfMatrix());
                    break;
                default:
                    System.out.println("Only choosen about (0-6) !!");
            }
        }
    }
}
