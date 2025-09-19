package com.dungeonsanddragons.monstercreator.demo.Features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeaturesController {
    private FeaturesService featuresService;

    @Autowired
    public FeaturesController(FeaturesService featuresService){
        this.featuresService = featuresService;
    }

    @GetMapping("/features")
    public String FeaturesForm(){
        return "features";
    }

    @PostMapping("/addFeatures")
    @ResponseBody
    public Features addFeatures(@RequestBody Features features){
        return featuresService.addFeatures(features);
    }
}
