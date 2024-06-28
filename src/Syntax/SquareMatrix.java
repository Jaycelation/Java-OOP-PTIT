package Syntax;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SquareMatrix {
    private int [][] a;

    public int getSize() {
        return a.length;
    }
    public SquareMatrix (int n) {
        a = new int[n][n];
    }
    public SquareMatrix(int[][] a) {
        this.a = a;
    }
    public int[][] getA() {
        return a;
    }
    public void setA(int[][] a) {
        this.a = a;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma tran vuong " + getSize() + "x" + getSize() + ":");
        for (int i = 0; i < getSize(); ++i) {
            for (int j = 0; j < getSize(); ++j) {
                a[i][j] = scanner.nextInt();
            }
        }
    }
    public void output() {
        for (int i = 0; i < getSize(); ++i) {
            for (int j = 0; j < getSize(); ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] transpose() {
        int [][] temp = new int[getSize()][getSize()];
        for (int i = 0; i < getSize(); ++i) {
            for (int j = 0; j < getSize(); ++j) {
                temp[i][j] = a[j][i];
            }
        }
        return temp;
    }
    public int [] sumOfRow() {
        int [] temp = new int[getSize()];
        for (int i = 0; i < getSize(); ++i) {
            temp[i] = 0;
            for (int j = 0; j < getSize(); ++j) {
                temp[i] += a[i][j];
            }
        }
        return temp;
    }
    private int getMax(int [] a) {
        int result = a[0];
        for (int i = 0; i < getSize(); ++i) {
            if (a[i] > result) {
                result = a[i];
            }
        }
        return result;
    }
    public void getMaxSum() {
        int [] row = sumOfRow();
        int [][] temp = transpose();
        SquareMatrix matrix = new SquareMatrix(getSize());
        matrix.setA(temp);

        int [] col = matrix.sumOfRow();
        int max1 = getMax(row);
        int max2 = getMax(col);
        if (max1 > max2) {
            System.out.print("Max = " + max1 + " hang:");
            for (int i = 0; i < getSize(); ++i) {
                if (row[i] == max1) {
                    System.out.print(i+1 + " ");
                }
            }
        } else if (max1 < max2) {
            System.out.print("Max = " + max2 + " cot:");
            for (int i = 0; i < getSize(); ++i) {
                if (col[i] == max2) {
                    System.out.print(i+1 + " ");
                }
            }
        }
        else {
            System.out.println("Max = " + max1);
        }
    }
    public boolean isSymmetric() {
        int [][] matrix = transpose();
        for (int i = 0; i < getSize(); ++i) {
            for (int j = 0; j < getSize(); ++j) {
                if (a[i][j] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public int detOfMatrix() {
        int size = getSize();
        int[][] temp = new int[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                temp[i][j] = a[i][j];
            }
        }
        int[] d = new int[size];
        int[] c = new int[size];
        int h, det = 1;
        int count = 0, kt = 1;
        for (int i = 0; i < size - 1; ++i) {
            if (temp[i][i] == 0) {
                kt = 0;
                for (int j = i + 1; j < size; ++j) {  // Fix the loop start
                    if (temp[j][i] != 0) {  // Fix the column check
                        for (int k = 0; k < size; ++k) {
                            c[k] = temp[i][k];
                            temp[i][k] = temp[j][k];
                            temp[j][k] = c[k];
                        }
                        count++;
                        kt++;
                        break;
                    }
                }
            }
            if (kt == 0) return 0;
            d[i] = temp[i][i];
            for (int j = i; j < size; ++j) {
                temp[i][j] = temp[i][j] / d[i];  // Perform division correctly
            }
            for (int j = i + 1; j < size; ++j) {
                h = temp[j][i];
                for (int k = i; k < size; ++k) {  // Fix the loop start
                    temp[j][k] = temp[j][k] - h * temp[i][k];
                }
            }
        }
        d[size - 1] = temp[size - 1][size - 1];  // Set the last element in d

        for (int i = 0; i < size; ++i) {
            det = det * d[i];
        }
        if (count % 2 == 0)
            return det;
        else
            return -det;
    }
}