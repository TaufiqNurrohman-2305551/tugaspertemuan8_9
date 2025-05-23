/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal2;

/**
 *
 * @author Taufiq Nurrohan
 */
public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName() + ", Date Hired: " + getDateHired().toString()
                + ", Title: " + rank + ", Office Hours: " + officeHours;
    }
}
