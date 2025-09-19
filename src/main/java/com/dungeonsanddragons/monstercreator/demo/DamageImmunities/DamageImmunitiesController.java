package com.dungeonsanddragons.monstercreator.demo.DamageImmunities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DamageImmunitiesController {
    private DamageImmunitiesService damageImmunitiesService;

    @Autowired
    public DamageImmunitiesController(DamageImmunitiesService damageImmunitiesService){
        this.damageImmunitiesService = damageImmunitiesService;
    }

    @GetMapping("damageImmunities")
    public String DamageImmunitesForm(){
        return "damageImmunities";
    }

    @PostMapping("addDamageImmunities")
    @ResponseBody
    public DamageImmunities addDamageImmunities(@RequestBody DamageImmunities damageImmunities){
        return damageImmunitiesService.addDamageImmunities(damageImmunities);
    }
}
