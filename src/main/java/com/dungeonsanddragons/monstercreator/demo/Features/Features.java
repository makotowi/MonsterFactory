package com.dungeonsanddragons.monstercreator.demo.Features;

import com.dungeonsanddragons.monstercreator.demo.Card.Card;
import jakarta.persistence.*;

@Entity
@Table(name = "features")
public class Features {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 5000)
    private String description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
