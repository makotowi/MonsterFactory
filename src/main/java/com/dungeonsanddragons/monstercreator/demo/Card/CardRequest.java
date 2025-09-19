package com.dungeonsanddragons.monstercreator.demo.Card;

import java.util.List;

public class CardRequest {
    private String name;
    private int armorClass;
    private int hitPoints;
    private int speed;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int cr;
    private int proficiencyBonus;

    private Long sizeId;
    private Long typeId;
    private Long alignmentId;

    private List<Long> skills;
    private List<Long> savingThrown;
    private List<Long> damageResistance;
    private List<Long> damageImmunities;
    private List<Long> conditionImmunities;
    private List<Long> senses;
    private List<Long> languages;
    private List<Long> features;
    private List<Long> actions;
    private List<Long> legendaryActions;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getArmorClass() { return armorClass; }
    public void setArmorClass(int armorClass) { this.armorClass = armorClass; }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getDexterity() { return dexterity; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }

    public int getConstitution() { return constitution; }
    public void setConstitution(int constitution) { this.constitution = constitution; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getWisdom() { return wisdom; }
    public void setWisdom(int wisdom) { this.wisdom = wisdom; }

    public int getCharisma() { return charisma; }
    public void setCharisma(int charisma) { this.charisma = charisma; }

    public int getCr() { return cr; }
    public void setCr(int cr) { this.cr = cr; }

    public int getProficiencyBonus() { return proficiencyBonus; }
    public void setProficiencyBonus(int proficiencyBonus) { this.proficiencyBonus = proficiencyBonus; }

    public Long getSizeId() { return sizeId; }
    public void setSizeId(Long sizeId) { this.sizeId = sizeId; }

    public Long getTypeId() { return typeId; }
    public void setTypeId(Long typeId) { this.typeId = typeId; }

    public Long getAlignmentId() { return alignmentId; }
    public void setAlignmentId(Long alignmentId) { this.alignmentId = alignmentId; }

    public List<Long> getSkills() { return skills; }
    public void setSkills(List<Long> skills) { this.skills = skills; }

    public List<Long> getSavingThrown() { return savingThrown; }
    public void setSavingThrown(List<Long> savingThrown) { this.savingThrown = savingThrown; }

    public List<Long> getDamageResistance() { return damageResistance; }
    public void setDamageResistance(List<Long> damageResistance) { this.damageResistance = damageResistance; }

    public List<Long> getDamageImmunities() { return damageImmunities; }
    public void setDamageImmunities(List<Long> damageImmunities) { this.damageImmunities = damageImmunities; }

    public List<Long> getConditionImmunities() { return conditionImmunities; }
    public void setConditionImmunities(List<Long> conditionImmunities) { this.conditionImmunities = conditionImmunities; }

    public List<Long> getSenses() { return senses; }
    public void setSenses(List<Long> senses) { this.senses = senses; }

    public List<Long> getLanguages() { return languages; }
    public void setLanguages(List<Long> languages) { this.languages = languages; }

    public List<Long> getFeatures() { return features; }
    public void setFeatures(List<Long> features) { this.features = features; }

    public List<Long> getActions() { return actions; }
    public void setActions(List<Long> actions) { this.actions = actions; }

    public List<Long> getLegendaryActions() { return legendaryActions; }
    public void setLegendaryActions(List<Long> legendaryActions) { this.legendaryActions = legendaryActions; }
}
