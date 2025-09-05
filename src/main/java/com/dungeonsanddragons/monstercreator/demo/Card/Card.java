package com.dungeonsanddragons.monstercreator.demo.Card;
import com.dungeonsanddragons.monstercreator.demo.Actions.Actions;
import com.dungeonsanddragons.monstercreator.demo.ConditionImmunities.ConditionImmunities;
import com.dungeonsanddragons.monstercreator.demo.DamageImmunities.DamageImmunities;
import com.dungeonsanddragons.monstercreator.demo.DamageResistance.DamageResistance;
import com.dungeonsanddragons.monstercreator.demo.Features.Features;
import com.dungeonsanddragons.monstercreator.demo.Languages.Languages;
import com.dungeonsanddragons.monstercreator.demo.LegendaryActions.LegendaryActions;
import com.dungeonsanddragons.monstercreator.demo.Senses.Senses;
import com.dungeonsanddragons.monstercreator.demo.Skills.Skills;
import com.dungeonsanddragons.monstercreator.demo.Stats.Stats;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String size;
    private String alignment;
    private int armorClass;
    private int hitPoints;
    private int speed;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    @OneToMany(mappedBy = "card")
    private List<Skills> skills = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<Stats> savingThrown = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<DamageResistance> damageResistance = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<DamageImmunities> damageImmunities = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<ConditionImmunities> conditionImmunities = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<Senses> senses = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<Languages> languages = new ArrayList<>();
    private int cr;
    private int proficiencyBonus;
    @OneToMany(mappedBy = "card")
    private List<Features> features = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<Actions> actions = new ArrayList<>();
    @OneToMany(mappedBy = "card")
    private List<LegendaryActions> legendaryActions = new ArrayList<>();

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<Stats> getSavingThrown() {
        return savingThrown;
    }

    public void setSavingThrown(List<Stats> savingThrown) {
        this.savingThrown = savingThrown;
    }

    public List<DamageResistance> getDamageResistance() {
        return damageResistance;
    }

    public void setDamageResistance(List<DamageResistance> damageResistance) {
        this.damageResistance = damageResistance;
    }

    public List<DamageImmunities> getDamageImmunities() {
        return damageImmunities;
    }

    public void setDamageImmunities(List<DamageImmunities> damageImmunities) {
        this.damageImmunities = damageImmunities;
    }

    public List<ConditionImmunities> getConditionImmunities() {
        return conditionImmunities;
    }

    public void setConditionImmunities(List<ConditionImmunities> conditionImmunities) {
        this.conditionImmunities = conditionImmunities;
    }

    public List<Senses> getSenses() {
        return senses;
    }

    public void setSenses(List<Senses> senses) {
        this.senses = senses;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public List<Actions> getActions() {
        return actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    public List<LegendaryActions> getLegendaryActions() {
        return legendaryActions;
    }

    public void setLegendaryActions(List<LegendaryActions> legendaryActions) {
        this.legendaryActions = legendaryActions;
    }
}
