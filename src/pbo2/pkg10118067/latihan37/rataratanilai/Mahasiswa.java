/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan37.rataratanilai;

/**
 *
 * @author Kiyo
 */
public class Mahasiswa {
    private double nilai = 0;
    private int jmlMahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }
    
    public double hitungRataRata() {
        return nilai / jmlMahasiswa;
    }
}
