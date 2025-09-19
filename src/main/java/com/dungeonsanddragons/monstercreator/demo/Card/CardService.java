package com.dungeonsanddragons.monstercreator.demo.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private CardRepository cardRepository;
    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card addStatblock(Card card) {
        return cardRepository.save(card);
    }
}
