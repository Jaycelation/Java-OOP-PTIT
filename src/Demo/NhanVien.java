package Demo;

public class NhanVien {
    private String id, name;
    private double income;

    public NhanVien() {
    }

    public NhanVien(String id, String name, double income) {
        this.id = id;
        this.name = name;
        this.income = income;
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public String toString() {
        return id + "\t" + name + "\t" + income;
    }
}
