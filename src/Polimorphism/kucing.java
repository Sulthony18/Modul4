/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphism;

/**
 *
 * @author ASUS
 */
class kucing extends hewan {

    void setNama() {
        String kucing = "Carberus";
        System.out.println("Nama Kucing  : " + kucing);
    }

    void setSuara() {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing : " + suara);
    }

    void setBerat() {
        double berat = 2.0;
        System.out.println("Berat Kucing : " + berat + " kg");
    }

}
