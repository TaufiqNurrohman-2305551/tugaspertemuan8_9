/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal2;

/**
 *
 * @author Taufiq Nurrohan
 */
public class Student extends Person {
    public static final String MAHASISWABARU = "Mahasiswa Baru";
    public static final String MAHASISWATAHUNKEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + getName() + ", Status: " + status;
    }
}
