package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String fname = "src/demo/nv.dat";
        try {
            Scanner scanner = new Scanner(new File(fname));
            String line;
            DecimalFormat f = new DecimalFormat("##.##");
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String [] s = line.split(";");
                int cnt = 0;
                double sum = 0;
                String st = s[1] + " (ID#" + s[0] + ") worked ";
                for (int i = 2; i < s.length; ++i) {
                    sum += Double.parseDouble(s[i]);
                    ++cnt;
                }
                double avg = sum/cnt;
                st += f.format(sum) + " hours (" + f.format(avg) + " hours a day)";
                System.out.println(st);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
