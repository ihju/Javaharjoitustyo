package com.example.harjtyo.service;

import com.example.harjtyo.data.Kurssi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KurssiService {
    private List<Kurssi> kurssit = new ArrayList<>();

    public void addKurssi(Kurssi kurssi) {kurssit.add(kurssi);}

    public List<Kurssi> getKurssit(){return new ArrayList<>(kurssit);}


}
