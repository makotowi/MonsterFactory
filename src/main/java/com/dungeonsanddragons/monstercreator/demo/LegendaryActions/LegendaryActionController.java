package com.dungeonsanddragons.monstercreator.demo.LegendaryActions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LegendaryActionController {
    private LegendaryActionService legendaryActionService;

    @Autowired
    public LegendaryActionController(LegendaryActionService legendaryActionService){
        this.legendaryActionService = legendaryActionService;
    }

    @GetMapping("/legendaryAction")
    public String LegendaryActionForm(){
        return "legendaryAction";
    }

    @PostMapping("/addLegendaryAction")
    @ResponseBody
    public LegendaryActions addLegendaryAction(@RequestBody LegendaryActions legendaryActions){
        return legendaryActionService.addLegendaryAction(legendaryActions);
    }
}
