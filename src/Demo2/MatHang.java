package Demo2;

import java.io.Serializable;

public class MatHang implements Serializable {
    private int id, product;
    private String name;
    private double unit;

    public MatHang() {
    }

    public MatHang(int id, String name, int product, double unit) {
        this.id = id;
        this.product = product;
        this.name = name;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public String toString() {
        return id + "\t" + name + "\t" + product + "\t" + unit + "\t" + (unit*product) + "\n";
    }
}
