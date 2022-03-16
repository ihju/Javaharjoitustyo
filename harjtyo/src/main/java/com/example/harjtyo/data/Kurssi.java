package com.example.harjtyo.data;

public class Kurssi {

    private String luokka;
    private String opettaja;
    private String kurssinNimi;

    public Kurssi(String kurssinNimi, String opettaja, String luokka) {
        this.kurssinNimi = kurssinNimi;
        this.opettaja = opettaja;
        this.luokka = luokka;
    }

    public String getKurssinNimi() {
        return kurssinNimi;
    }

    public void setKurssinNimi(String kurssinNimi) {
        this.kurssinNimi = kurssinNimi;
    }

    public String getOpettaja() {
        return opettaja;
    }

    public void setOpettaja(String opettaja) {
        this.opettaja = opettaja;
    }

    public String getLuokka() {
        return luokka;
    }

    public void setLuokka(String luokka) {
        this.luokka = luokka;
    }
}
