package com.dungeonsanddragons.monstercreator.demo.Senses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SensesController {
    private SensesService sensesService;

    @Autowired
    public SensesController(SensesService sensesService){
        this.sensesService = sensesService;
    }

    @GetMapping("/senses")
    public String SensesForm(){
        return "senses";
    }
    @PostMapping("/addSenses")
    @ResponseBody
    public Senses addSenses(@RequestBody Senses senses){
        return sensesService.addSenses(senses);
    }
}
