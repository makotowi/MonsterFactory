package com.dungeonsanddragons.monstercreator.demo.Features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeaturesService {
    private FeaturesRepository featuresRepository;

    @Autowired
    public FeaturesService(FeaturesRepository featuresRepository){
        this.featuresRepository = featuresRepository;
    }

    public Features addFeatures(Features features) {
        return featuresRepository.save(features);
    }

    public List<Features> showFeatures() {
        return featuresRepository.findAll();
    }

    public List<Features> findAllById(List<Long> features) {
        return featuresRepository.findAllById(features);
    }
}
