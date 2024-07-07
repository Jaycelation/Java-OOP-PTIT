package Syntax;

import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ExceptionHanding {
    public static void main(String[] args) {
        int x, y, z;
        x = 8;
        y = 0;
        //Xu ly ngoai le
        try {
            z = x/y;
            System.out.print("z: " + z);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
        System.out.println("Now here!");

        String st = "Ngay Ha Noi nang!";
        try {
            System.out.println(st.substring(50));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //Checked
        //Mot try co the nhieu catch va neu nhu vay thi phai co finally
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String sd = "01/10/2022";
        String snum = "b345";
        try {
            Date d = f.parse(sd);
            System.out.println(d);
            int num = Integer.parseInt(snum);
            System.out.println(snum);
        } catch (ParseException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Luon luon thuc hien!");
        }

        //checked exceptions
        try {
            File inputFile = new File("student.txt");
            Scanner input = new Scanner(inputFile);
            while (input.hasNextLine()) {
                System.out.println("> " + input.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find the file 'student.txt!'.");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
