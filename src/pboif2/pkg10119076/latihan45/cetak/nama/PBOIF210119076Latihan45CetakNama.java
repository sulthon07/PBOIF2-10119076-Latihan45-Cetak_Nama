/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan45.cetak.nama;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi :Cetak Nama
 */
public class PBOIF210119076Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Printer objPrinter = new Printer();

        

        System.out.println("======Aplikasi Pencetak Nama======");

        System.out.print("Masukkan nama anda : ");

        objPrinter.setNama(input.nextLine());

        System.out.print("Mau cetak nama berapa kali? : ");

        objPrinter.setJmlCetak(input.nextInt());

        

        objPrinter.cetak(objPrinter.getNama());

        objPrinter.cetak(objPrinter.getJmlCetak(), objPrinter.getNama());
    }
    
}
