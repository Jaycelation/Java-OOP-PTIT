package Demo2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IOFile {
    //Read file, save -> list
    public static <T> List<T> read(String fname) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>)o.readObject();
            o.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        return list;
    }
    //List = write->List
    public static <T> void write(String fname,List<T> arr) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(arr);
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
