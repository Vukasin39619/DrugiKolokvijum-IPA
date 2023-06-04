/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author Vukisha
 */
public class FrancuskiBuldog {
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Karakteristika getKarakteristika() {
        return karakteristika;
    }

    public void setKarakteristika(Karakteristika karakteristika) {
        this.karakteristika = karakteristika;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public FrancuskiBuldog() {
        this.rasa = "";
        this.vrsta = "";
        this.karakteristika = null;
        this.godine = 0;
    }
    private String rasa;
    private String vrsta;
    private Karakteristika karakteristika;
    private int godine;
}
