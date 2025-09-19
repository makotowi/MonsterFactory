package com.dungeonsanddragons.monstercreator.demo.DamageImmunities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageImmunitiesService {
    private DamageImmunitiesRepository damageImmunitiesRepository;

    @Autowired
    public DamageImmunitiesService(DamageImmunitiesRepository damageImmunitiesRepository){
        this.damageImmunitiesRepository = damageImmunitiesRepository;
    }

    public DamageImmunities addDamageImmunities(DamageImmunities damageImmunities) {
        return damageImmunitiesRepository.save(damageImmunities);
    }

    public List<DamageImmunities> showDamageImmunities() {
        return damageImmunitiesRepository.findAll();
    }

    public List<DamageImmunities> findAllById(List<Long> damageImmunities) {
        return damageImmunitiesRepository.findAllById(damageImmunities);
    }
}
