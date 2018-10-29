/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan57.vehicle;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : 
 *
 */
public class SkateBoard extends Vehicle{
    
    private double myBoardLength;

    public SkateBoard(){
        this.myBoardLength = 0;
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLength(54.5);

        System.out.println("\nSkateboard");
        System.out.println("Brand  : "+getMyBrand());
        System.out.println("Model  : "+getMyModel());
        System.out.println("Panjangnya Board: "+getMyBoardLength());
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

}
