package Demo2;

import java.io.Serial;
import java.io.Serializable;

public class SinhVien implements Serializable {
    private String id, name;
    private double point;

    public SinhVien(String id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public SinhVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    public String toString() {
        return id + "\t" + name + "\t" + point + "\n";
    }
}
