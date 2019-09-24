/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA  : Tegar Lucky'Q Oakley 
 * NIM   : 10118066 
 * KELAS : IF2 
 * Deskripsi Program : Program ini berisi program untuk Menjumlahkan Kambing Static dan Konstanta 
 */
public class KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "MIDUN";
      
        public static void main(String[] args) {
            Mamalia.jumlahKambing = 485000;
            System.out.println(NAMA_KAMBING + " Memiliki Kambing Sebanyak " + Mamalia.jumlahKambing);
    }
    
}
