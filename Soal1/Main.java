/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal1;

/**
 *
 * @author Taufiq Nurrohan
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi 3: ");
        double sisi3 = input.nextDouble();
        input.nextLine(); 

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();
        System.out.print("Apakah segitiga diisi (true/false): ");
        boolean diisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setDiisi(diisi);

        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Diisi: " + segitiga.getIsDiisi());
    }
}
