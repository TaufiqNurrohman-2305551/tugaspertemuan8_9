/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal1;

/**
 *
 * @author Taufiq Nurrohan
 */
public class Segitiga extends ObjekGeometris {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga() {
        super();
        sisi1 = 1;
        sisi2 = 1;
        sisi3 = 1;
    }

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        super();
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + ", sisi2 = " + sisi2 + ", sisi3 = " + sisi3;
    }
}
