package com.dungeonsanddragons.monstercreator.demo.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TypeController {
    private TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/type")
    public String typeSelector(){
        return "type";
    }

    @PostMapping("/addType")
    @ResponseBody
    public Type addType(@RequestBody Type type){
        return typeService.addType(type);
    }
}
