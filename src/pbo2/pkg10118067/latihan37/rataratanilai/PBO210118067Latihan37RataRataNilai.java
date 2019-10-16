/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan rata" nilai dari nilai
 * tertentu
 */
public class PBO210118067Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setJmlMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getJmlMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +
                mahasiswa.hitungRataRata());
    }
    
}
