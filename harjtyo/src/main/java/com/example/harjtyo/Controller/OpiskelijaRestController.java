package com.example.harjtyo.Controller;

import com.example.harjtyo.data.Opiskelija;
import com.example.harjtyo.service.OpiskelijaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OpiskelijaRestController {

    @Autowired
    OpiskelijaService myOpiskelijaService;

    @GetMapping("opiskelijat")
    public List<Opiskelija> getOpiskelijat() {return myOpiskelijaService.getOpiskelijat();}

    @PostMapping("addopiskelija")
    public String addOpiskelija(@RequestBody Opiskelija opiskelija){
        myOpiskelijaService.addOpiskelija(opiskelija);
        return "";
    }
}
