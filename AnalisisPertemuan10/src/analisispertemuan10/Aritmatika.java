/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisispertemuan10;

/**
 *
 * @author mnuri
 */
public class Aritmatika {
    private int bilangan1, bilangan2, bilangan3;

    /**
     * @return the bilangan1
     */
    public int getBilangan1() {
        return bilangan1;
    }

    /**
     * @param bilangan1 the bilangan1 to set
     */
    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    /**
     * @return the bilangan2
     */
    public int getBilangan2() {
        return bilangan2;
    }

    /**
     * @param bilangan2 the bilangan2 to set
     */
    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }

    /**
     * @return the bilangan3
     */
    public int getBilangan3() {
        return bilangan3;
    }

    /**
     * @param bilangan3 the bilangan3 to set
     */
    public void setBilangan3(int bilangan3) {
        this.bilangan3 = bilangan3;
    }
    
    public double hitungRataRata() {
        return (double) (this.bilangan1 + this.bilangan2 + this.bilangan3) / 3;
    }
}
