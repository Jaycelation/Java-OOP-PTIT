import KiemTra1.Matrix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix a = null;
        while (true) {
            System.out.println("1. Enter Matrix");
            System.out.println("2. Write Matrix");
            System.out.println("3. Sum of Row");
            System.out.println("4. Find the maximum of Row");
            System.out.println("5. Sum 2 Matrix");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("0. Exit");
            System.out.print("Let pick (0-9): ");
            int choosen;
            Scanner scanner = new Scanner(System.in);
            choosen = scanner.nextInt();
            switch (choosen) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    int row, col;
                    System.out.println("Enter row, col:");
                    row = scanner.nextInt();
                    col = scanner.nextInt();
                    a = new Matrix(row, col);
                    a.input();
                    break;
                default:
                    System.out.println("Only pick in range(0, 9)");
                    break;
               case 2:
                   a.output();
                   break;
                case 3:
                    a.writeSumOfRow();
                    break;
                case 4:
                    a.maxOfRow();
                    break;
                case 5:
                    Matrix b = new Matrix(a.getRow(), a.getCol());
                    b.input();
                    Matrix sum = a.sum(b);
                    a.output();
                    b.output();
                    sum.output();
                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
//                case 9:
//                    break;
            }
        }
    }
}
//to be continue ...