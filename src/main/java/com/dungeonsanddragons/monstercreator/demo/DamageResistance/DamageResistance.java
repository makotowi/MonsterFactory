package com.dungeonsanddragons.monstercreator.demo.DamageResistance;

import com.dungeonsanddragons.monstercreator.demo.Card.Card;
import jakarta.persistence.*;

@Entity
@Table(name = "damageResistance")
public class DamageResistance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

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
}
