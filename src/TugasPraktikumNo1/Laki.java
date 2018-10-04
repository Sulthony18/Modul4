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
public class Laki extends Siswa {

    private double tb;
    private double bb;

    public Laki(double tb, double bb) {
        this.tb = tb;
        this.bb = bb;

    }

    @Override
    public double beratBadan() {
        return (tb - 100) - ((tb - 100) * 0.1);
    }

    @Override
    public double tinggiBadan() {
        return tb;
    }

}
