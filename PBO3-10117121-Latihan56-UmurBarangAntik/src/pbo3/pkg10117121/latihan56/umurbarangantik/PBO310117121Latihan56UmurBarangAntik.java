/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan56.umurbarangantik;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : 
 *
 */
public class PBO310117121Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio radio = new 
        Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    
    }

}
