/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.ArrayList;

/**
 *
 * @author Vukisha
 */
public class Karakteristika {

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public String getDuzinaDlake() {
        return duzinaDlake;
    }

    public void setDuzinaDlake(String duzinaDlake) {
        this.duzinaDlake = duzinaDlake;
    }

    public ArrayList<String> getBojaDlake() {
        return bojaDlake;
    }

    public void setBojaDlake(ArrayList<String> bojaDlake) {
        this.bojaDlake = bojaDlake;
    }

    public ArrayList<String> getBojaOka() {
        return bojaOka;
    }

    public void setBojaOka(ArrayList<String> bojaOka) {
        this.bojaOka = bojaOka;
    }

    public Karakteristika() {
        this.velicina = "";
        this.duzinaDlake = "";
        this.bojaDlake = null;
        this.bojaOka = null;
    }
    
    private String velicina;
    private String duzinaDlake;
    private ArrayList<String> bojaDlake;
    private ArrayList<String> bojaOka;

}
