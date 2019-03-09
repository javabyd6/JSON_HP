package com.sda.json;

/**
 * @author perczynski
 */
public class Student {

    private  String name;
    private  String lastname;
    private  Address addres;

    public Student(String name, String lastname, Address addres) {
        this.name = name;
        this.lastname = lastname;
        this.addres = addres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAddres() {
        return addres;
    }
}
