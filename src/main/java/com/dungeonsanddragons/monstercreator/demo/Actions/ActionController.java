package com.dungeonsanddragons.monstercreator.demo.Actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActionController {
    private ActionService actionService;

    @Autowired
    public ActionController(ActionService actionService){
        this.actionService = actionService;
    }

    @GetMapping("/action")
    public String ActionForm(){
        return "action";
    }

    @PostMapping("/addAction")
    @ResponseBody
    public Actions addAction(@RequestBody Actions actions){
        return actionService.addAction(actions);
    }
}
