package com.dungeonsanddragons.monstercreator.demo.DamageResistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageResistanceService {
    private DamageResistanceRepository damageResistanceRepository;

    @Autowired
    public DamageResistanceService(DamageResistanceRepository damageResistanceRepository){
        this.damageResistanceRepository = damageResistanceRepository;
    }

    public DamageResistance addDamageResistance(DamageResistance damageResistance) {
        return damageResistanceRepository.save(damageResistance);
    }

    public List<DamageResistance> showDamageResistance() {
        return damageResistanceRepository.findAll();
    }
}
