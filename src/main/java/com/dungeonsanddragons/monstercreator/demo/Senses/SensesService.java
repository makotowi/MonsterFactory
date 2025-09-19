package com.dungeonsanddragons.monstercreator.demo.Senses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensesService {
    private SensesRepository sensesRepository;

    @Autowired
    public SensesService(SensesRepository sensesRepository){
        this.sensesRepository = sensesRepository;
    }

    public Senses addSenses(Senses senses) {
        return sensesRepository.save(senses);
    }

    public List<Senses> showSenses() {
        return sensesRepository.findAll();
    }

    public List<Senses> findAllById(List<Long> senses) {
        return sensesRepository.findAllById(senses);
    }
}
