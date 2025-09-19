package com.dungeonsanddragons.monstercreator.demo.Actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {
    private ActionRepository actionRepository;

    @Autowired
    public ActionService(ActionRepository actionRepository){
        this.actionRepository = actionRepository;
    }

    public Actions addAction(Actions actions) {
        return actionRepository.save(actions);
    }

    public List<Actions> showAction() {
        return actionRepository.findAll();
    }

    public List<Actions> findAllById(List<Long> actions) {
        return actionRepository.findAllById(actions);
    }
}
