package com.dungeonsanddragons.monstercreator.demo.Skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    private SkillsRepository skillsRepository;

    @Autowired
    public SkillsService(SkillsRepository skillsRepository){
        this.skillsRepository =skillsRepository;
    }

    public Skills addSkill(Skills skills) {
        return skillsRepository.save(skills);
    }

    public List<Skills> showSkills() {
        return skillsRepository.findAll();
    }

    public List<Skills> findAllById(List<Long> skills) {
        return skillsRepository.findAllById(skills);
    }
}
