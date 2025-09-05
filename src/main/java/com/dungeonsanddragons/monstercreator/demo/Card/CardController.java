package com.dungeonsanddragons.monstercreator.demo.Card;

import com.dungeonsanddragons.monstercreator.demo.Languages.LanguageService;
import com.dungeonsanddragons.monstercreator.demo.Languages.Languages;
import org.intellij.lang.annotations.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CardController {

    private CardService cardService;
    private LanguageService languageService;

    @Autowired
    public CardController(CardService cardService, LanguageService languageService) {
        this.cardService = cardService;
        this.languageService = languageService;
    }

    @GetMapping("/")
    public String statBlock(){
        return "statBlock";
    }

    @GetMapping("/showLanguages")
    @ResponseBody
    public List<Languages> showLanguages(){
        return languageService.showLanguage();
    }
}
