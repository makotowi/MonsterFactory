package com.dungeonsanddragons.monstercreator.demo.Languages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService){
        this.languageService = languageService;
    }


    @GetMapping("/language")
    public String Languages(){
        return "languages";
    }

    @PostMapping("/addLanguage")
    @ResponseBody
    public Languages addLanguage(@RequestBody Languages languages){
        return languageService.addLanguage(languages);
    }
}
