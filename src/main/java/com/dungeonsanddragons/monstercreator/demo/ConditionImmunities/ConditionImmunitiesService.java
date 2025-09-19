package com.dungeonsanddragons.monstercreator.demo.ConditionImmunities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionImmunitiesService {
    private ConditionImmunitiesRepository conditionImmunitiesRepository;

    @Autowired
    public ConditionImmunitiesService(ConditionImmunitiesRepository conditionImmunitiesRepository){
        this.conditionImmunitiesRepository = conditionImmunitiesRepository;
    }

    public List<ConditionImmunities> showContitionImmunities() {
        return conditionImmunitiesRepository.findAll();
    }

    public ConditionImmunities addConditionImmunities(ConditionImmunities conditionImmunities) {
        return conditionImmunitiesRepository.save(conditionImmunities);
    }

    public List<ConditionImmunities> findAllById(List<Long> conditionImmunities) {
        return conditionImmunitiesRepository.findAllById(conditionImmunities);
    }
}
