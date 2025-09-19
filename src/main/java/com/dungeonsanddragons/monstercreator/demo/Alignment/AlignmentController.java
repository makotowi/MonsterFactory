package com.dungeonsanddragons.monstercreator.demo.Alignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlignmentController {
    private AlignmentService alignmentService;

    @Autowired
    public AlignmentController(AlignmentService alignmentService) {
        this.alignmentService = alignmentService;
    }

    @GetMapping("/alignment")
    public String AlignmentSelector(){
        return "alignment";
    }

    @PostMapping("/addAlignment")
    @ResponseBody
    public Alignment addAlignment(@RequestBody Alignment alignment){
        return alignmentService.addAlignment(alignment);
    }
}
