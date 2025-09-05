package com.dungeonsanddragons.monstercreator.demo.Languages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }


    public Languages addLanguage(Languages languages) {
        return languageRepository.save(languages);
    }

    public List<Languages> showLanguage(){
        return languageRepository.findAll();
    }
}
