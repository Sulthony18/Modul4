/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikumNo2;

/**
 *
 * @author ASUS
 */
public class Operasi implements Kalkulator {

    private double angka1;
    private double angka2;

    public Operasi(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public double penjumlahan() {
        return angka1 + angka2;
    }

    @Override
    public double pengurangan() {
        return angka1 - angka2;
    }

    @Override
    public double perkalian() {
        return angka1 * angka2;
    }

    @Override
    public double pembagian() {
        return angka1 / angka2;
    }
}
