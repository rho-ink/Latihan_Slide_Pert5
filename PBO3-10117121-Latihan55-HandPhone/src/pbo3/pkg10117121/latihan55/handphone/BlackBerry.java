/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan55.handphone;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : 
 *
 */
public class BlackBerry extends HandPhone{
private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
