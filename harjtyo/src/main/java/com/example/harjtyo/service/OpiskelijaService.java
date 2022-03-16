package com.example.harjtyo.service;

import com.example.harjtyo.data.Opiskelija;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpiskelijaService {
    private List<Opiskelija> opiskelijat = new ArrayList<>();

    public void addOpiskelija(Opiskelija opiskelija) { opiskelijat.add(opiskelija);}

    public List<Opiskelija> getOpiskelijat() {return new ArrayList<>(opiskelijat);}



}
