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
public class Uji {

    public static void main(String[] args) {
        Operasi a = new Operasi(25, 5) {
        };
        System.out.println("Hasil Penjumlahan dari 25 dan 5 adalah " + a.penjumlahan());
        System.out.println("Hasil Pengurangan dari 25 dan 5 adalah " + a.pengurangan());
        System.out.println("Hasil Perkalian dari 25 dan 5 adalah " + a.perkalian());
        System.out.println("Hasil Pembagian dari 25 dan 5 adalah " + a.pembagian());

    }
}
