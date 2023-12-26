/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan10;

/**
 *
 * @author mnuri
 */
public class Pengguna {
    private String id_pengguna, nama;
    private int level;
    
    public Pengguna(String id_pengguna, String nama, int level) {
        this.id_pengguna = id_pengguna;
        this.nama = nama;
        this.level = level;
    }

    /**
     * @return the id_pengguna
     */
    public String getId_pengguna() {
        return id_pengguna;
    }

    /**
     * @param id_pengguna the id_pengguna to set
     */
    public void setId_pengguna(String id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
}
