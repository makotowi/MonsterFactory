package com.dungeonsanddragons.monstercreator.demo.Skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    private SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @GetMapping("/skills")
    public String SkillForm(){
        return "skills";
    }

    @PostMapping("/addSkill")
    @ResponseBody
    public Skills addSkill(@RequestBody Skills skills){
        return skillsService.addSkill(skills);
    }
}
