package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        File file = new File("src/demo/test.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.length());
//        long timeStamp = file.lastModified();
//        Date date = new Date(timeStamp);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String fomattedDate = dateFormat.format(date);
//        System.out.println(fomattedDate);

        File f = new File("src/demo/example1.txt");
        try {
            Scanner scanner = new Scanner(f);
            int cnt = 1;
            double num;
            double sum = 0;
            DecimalFormat ft = new DecimalFormat("##.##");
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    num = scanner.nextDouble();
                    System.out.println("Number " + cnt + ": " + ft.format(num));
                    sum += num;
                    ++cnt;
                }
                else {
                    scanner.next();
                }
            }
            scanner.close();
            System.out.println("Sum: " + ft.format(sum));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        File file = new File("src/demo/test.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
