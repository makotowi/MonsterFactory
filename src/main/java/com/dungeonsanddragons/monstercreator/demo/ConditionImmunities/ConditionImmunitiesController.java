package com.dungeonsanddragons.monstercreator.demo.ConditionImmunities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConditionImmunitiesController {
    private ConditionImmunitiesService conditionImmunitiesService;

    @Autowired
    public ConditionImmunitiesController(ConditionImmunitiesService conditionImmunitiesService){
        this.conditionImmunitiesService = conditionImmunitiesService;
    }

    @GetMapping("/conditionImmunities")
    public String ConditionImmunitiesForm(){
        return "conditionImmunities";
    }

    @PostMapping("/addConditionImmunities")
    @ResponseBody
    public ConditionImmunities addConditionImmunities(@RequestBody ConditionImmunities conditionImmunities){
        return conditionImmunitiesService.addConditionImmunities(conditionImmunities);
    }
}
