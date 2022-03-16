package com.example.harjtyo.data;

public class Opiskelija {

    private String osoite;
    private String etunimi;
    private String sukunimi;

    public Opiskelija(String etunimi, String sukunimi, String osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.osoite = osoite;
    }
    public Opiskelija(){
        this("","","");
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }


}
