package com.example.harjtyo.Controller;

import com.example.harjtyo.data.Kurssi;
import com.example.harjtyo.service.KurssiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KurssiController {

    @Autowired
    KurssiService myKurssiController;

    @GetMapping("kurssit")
    public List<Kurssi> getKurssit() {return myKurssiController.getKurssit();}

    @PostMapping("addkurssi")
    public String addKurssi(@RequestBody Kurssi kurssi){
        myKurssiController.addKurssi(kurssi);
        return "";
    }
}
