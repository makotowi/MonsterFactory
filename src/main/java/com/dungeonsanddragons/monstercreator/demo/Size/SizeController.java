package com.dungeonsanddragons.monstercreator.demo.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SizeController {

    private SizeService sizeService;

    @Autowired
    public SizeController(SizeService sizeService) {
        this.sizeService = sizeService;
    }

    @GetMapping("/size")
    public String sizeSelector(){
        return "size";
    }

    @PostMapping("/addSize")
    @ResponseBody
    public Size addSize(@RequestBody Size size){
        return sizeService.addSize(size);
    }
}
