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
public class Perempuan extends Siswa {

    private double tb1;
    private double bb1;

    public Perempuan(double tb1, double bb1) {
        this.tb1 = tb1;
        this.bb1 = bb1;

    }

    @Override
    public double beratBadan() {
        return (tb1 - 100) - ((tb1 - 100) * 0.15);
    }

    @Override
    public double tinggiBadan() {
        return tb1;
    }
}
