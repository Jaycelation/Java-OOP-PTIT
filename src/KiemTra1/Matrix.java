package KiemTra1;
import java.util.Scanner;

public class Matrix {
    private int [][] a;

    public Matrix(int row, int col) {
        a = new int [row][col];
    }
    public int getRow() {
        return a.length;
    }
    public int getCol() {
        return a[0].length;
    }
    public int[][] getMatrix() {
        return a;
    }
    public void setMatrix(int[][] a) {
        this.a = a;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the matrix have " + a.length + " row and " + a[0].length + " col:");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
    public void output() {
        System.out.println("This is the Matrix have " + a.length + " row and " + a[0].length + " col:");
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    private int [] sumOfRow() {
        int [] temp = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            temp[i] = 0;
            for (int j = 0; j < a[0].length; ++j) {
                temp[i] += a[i][j];
            }
        }
        return temp;
    }
    public void writeSumOfRow() {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Sum of row " + (i+1) + ": " + sumOfRow()[i]);
        }
    }
    public void maxOfRow() {
        int [] temp = sumOfRow();
        int max = temp[0];
        for (int i = 1; i < temp.length; ++i) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.print("Maximum of the Matrix is " + max + ": ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == max) {
                System.out.print(i+1 + " ");
            }
        }
        System.out.println();
    }
    public Matrix sum(Matrix matrix) {
        Matrix temp = new Matrix(getRow(), getCol());
        int [][] c = new int[getRow()][getCol()];
        for (int i = 0 ; i < getRow(); ++i) {
            for (int j = 0; j < getCol(); ++j) {
                c[i][j] = a[i][j] + matrix.getMatrix()[i][j];
            }
        }
        temp.setMatrix(c);
        return temp;
    }
}