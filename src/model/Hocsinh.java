package model;

public class Hocsinh {
    private String code, name, address;
    private int birthYear;
    private boolean gender;

    public Hocsinh (){}
    public Hocsinh(String code, String name, boolean gender, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + (gender ? "male" : "female") + "\t" + birthYear + "\t" + address + "\n";
    }
}