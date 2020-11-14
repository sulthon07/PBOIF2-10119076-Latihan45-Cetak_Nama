/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan45.cetak.nama;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi :Cetak Nama
 */
public class Printer {
    private int jmlCetak;

    private String nama;



    public int getJmlCetak() {

        return jmlCetak;

    }



    public void setJmlCetak(int jmlCetak) {

        this.jmlCetak = jmlCetak;

    }



    public String getNama() {

        return nama;

    }



    public void setNama(String nama) {

        this.nama = nama;

    }

    

    public void cetak(String nama){

        System.out.println("Nama Anda : "+getNama());

    }

    

    public void cetak(int jmlCetak, String nama){

        System.out.println("Hasil Cetak : ");

        System.out.println("");

        for (int i = 1; i <= getJmlCetak(); i++) {

            System.out.println(i+". "+getNama());
        }
    }    
}
