package com.dungeonsanddragons.monstercreator.demo.DamageResistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DamageResistanceController {
    private DamageResistanceService damageResistanceService;

    @Autowired
    public DamageResistanceController(DamageResistanceService damageResistanceService){
        this.damageResistanceService = damageResistanceService;
    }

    @GetMapping("/damageResistance")
    public String DamageResistanceForm(){
        return "damageResistance";
    }

    @PostMapping("/addDamageResistance")
    @ResponseBody
    public DamageResistance addDamageResistance(@RequestBody DamageResistance damageResistance){
        return damageResistanceService.addDamageResistance(damageResistance);
    }
}
