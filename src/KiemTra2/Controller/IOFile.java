package KiemTra2.Controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static <T> List<T> read(String fname) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return list;
    }

    public static <T> void write(String fname, List<T> arr) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fname));
            objectOutputStream.writeObject(arr);
            objectOutputStream.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}