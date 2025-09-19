package com.dungeonsanddragons.monstercreator.demo.Alignment;

import com.dungeonsanddragons.monstercreator.demo.Card.Card;
import jakarta.persistence.*;

@Entity
@Table(name = "alignment")
public class Alignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
