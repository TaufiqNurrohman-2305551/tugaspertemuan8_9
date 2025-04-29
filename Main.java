/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal2;

/**
 *
 * @author Taufiq Nurrohan
 */
public class Main {
     public static void main(String[] args) {
        Person person = new Person("Supriyadi", "Ambon", "085938203219", "suppriii@gmail.com");
        Student student = new Student("Qori", "Bandung", "081389267384", "Qoorii@gmail.com", Student.MAHASISWATAHUNKEDUA);
        Employee employee = new Employee("Kurnia", "Aceh", "081256382688", "kurniaa@gmail.com", "Ruang 98", 6700000, new MyDate(2023, 8, 12));
        Faculty faculty = new Faculty("Pak Adi", "Sumedang", "082739277628", "adisatyo@gmail.com", "Ruang 38", 8500000, new MyDate(2021, 3, 19), "08:00-17:00", "Dekan");
        Staff staff = new Staff("Pa Juki", "Yogyakarta", "082828936711", "jukii@gmail.com", "Ruang 2", 4000000, new MyDate(2024, 4, 20), "Admin");

        System.out.println(person + "\n");
        System.out.println(student + "\n");
        System.out.println(employee + "\n");
        System.out.println(faculty + "\n");
        System.out.println(staff);
    }
}