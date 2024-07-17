package KiemTra2;

import java.io.Serializable;
import java.text.DecimalFormat;

public class PTGT implements Serializable, Comparable<PTGT> {
    private String id, brand, color;
    private int year;
    private double price;

    public PTGT() {}

    public PTGT(String id, String brand, int year, double price, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return id + "\t" + brand + "\t" + year + "\t" + decimalFormat.format(price) + "\t" + color;
    }

    public int compareTo(PTGT o) {
        //Sort tang dan
        return this.year - o.getYear();
        //Sort giam dan
        //return o.getYear() - this.year;
    }

}