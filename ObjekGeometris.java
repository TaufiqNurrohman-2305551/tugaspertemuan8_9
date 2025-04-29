/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Soal1;

/**
 *
 * @author Taufiq Nurrohan
 */
public class ObjekGeometris {
    private String warna ;
    private boolean diisi;

    public ObjekGeometris() {
        warna = "putih";
        diisi = false;
    }

    public ObjekGeometris(String warna, boolean diisi) {
        this.warna = warna;
        this.diisi = diisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean getIsDiisi() {
        return diisi;
    }

    public void setDiisi(boolean diisi) {
        this.diisi = diisi;
    }

}
