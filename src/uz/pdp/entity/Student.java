package uz.pdp.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id = lastId++;
    private String firstName;
    private String lastName;
    private String phone;
    private static Integer lastId = 0;

    public Student(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public Integer getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return id + "  " + firstName + " " + lastName;
    }
}
