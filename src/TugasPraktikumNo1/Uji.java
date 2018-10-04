/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikumNo1;

/**
 *
 * @author ASUS
 */
public class Uji {
    public static void main (String[] args){
        Siswa a = new Laki(175, 55);
        System.out.println("Tinggi badan laki laki = " + a.tinggiBadan()+ " cm");
        System.out.println("Berat badan ideal laki laki adalah = " 
                + a.beratBadan() + " kg");
        
        Siswa b = new Perempuan(175, 55);
        System.out.println("");
        System.out.println("Tinggi badan perempuan = " + b.tinggiBadan()+ " cm");
        System.out.println("Berat badan ideal perempuan adalah = " 
                + b.beratBadan() + " kg");
        
        
    }
}
