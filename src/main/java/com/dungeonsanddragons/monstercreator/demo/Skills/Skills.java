package com.dungeonsanddragons.monstercreator.demo.Skills;

import com.dungeonsanddragons.monstercreator.demo.Card.Card;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int statBlockBonus;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatBlockBonus() {
        return statBlockBonus;
    }

    public void setStatBlockBonus(int statBlockBonus) {
        this.statBlockBonus = statBlockBonus;
    }
}
