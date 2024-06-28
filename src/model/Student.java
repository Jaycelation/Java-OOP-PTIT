package model;

import java.util.Scanner;

public class Student {
    //Thuoc tinh
    private String code, name, address;
    private int birthYear;

    public Student(){}
    public Student(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String toString() {
        return code + "\t" + name + "\t" + birthYear + "\t" + address;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Code:");
        code = scanner.nextLine();

        System.out.println("Enter Name:");
        name = scanner.nextLine();

        System.out.println("Enter Birth of Year:");
        birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Address:");
        address = scanner.nextLine();
        scanner.close();
    }
}