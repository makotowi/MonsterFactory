package com.dungeonsanddragons.monstercreator.demo.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private TypeReposytory typeReposytory;

    @Autowired
    public TypeService(TypeReposytory typeReposytory){
        this.typeReposytory = typeReposytory;
    }

    public List<Type> showType() {
        return typeReposytory.findAll();
    }

    public Type addType(Type type) {
        return typeReposytory.save(type);
    }
}
