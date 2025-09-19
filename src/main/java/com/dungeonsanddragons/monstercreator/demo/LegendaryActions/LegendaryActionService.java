package com.dungeonsanddragons.monstercreator.demo.LegendaryActions;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegendaryActionService {
    private LegendaryActionRepository legendaryActionRepository;

    public LegendaryActionService(LegendaryActionRepository legendaryActionRepository){
        this.legendaryActionRepository = legendaryActionRepository;
    }

    public LegendaryActions addLegendaryAction(LegendaryActions legendaryActions) {
        return legendaryActionRepository.save(legendaryActions);
    }

    public List<LegendaryActions> showLegendaryAction() {
        return legendaryActionRepository.findAll();
    }
}
