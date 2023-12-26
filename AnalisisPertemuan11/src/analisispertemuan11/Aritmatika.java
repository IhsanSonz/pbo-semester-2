/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisispertemuan11;

/**
 *
 * @author mnuri
 */
public class Aritmatika {
    private int bilangan1, bilangan2, bilangan3;
    
    public Aritmatika(int bilangan1, int bilangan2, int bilangan3) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
        this.bilangan3 = bilangan3;
    }

    /**
     * @return the bilangan1
     */
    public int getBilangan1() {
        return bilangan1;
    }

    /**
     * @return the bilangan2
     */
    public int getBilangan2() {
        return bilangan2;
    }

    /**
     * @return the bilangan3
     */
    public int getBilangan3() {
        return bilangan3;
    }
    
    public double hitungRataRata() {
        return (double) (this.bilangan1 + this.bilangan2 + this.bilangan3) / 3;
    }
}
