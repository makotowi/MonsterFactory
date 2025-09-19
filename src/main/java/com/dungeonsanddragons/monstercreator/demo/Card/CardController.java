package com.dungeonsanddragons.monstercreator.demo.Card;

import com.dungeonsanddragons.monstercreator.demo.Actions.ActionService;
import com.dungeonsanddragons.monstercreator.demo.Actions.Actions;
import com.dungeonsanddragons.monstercreator.demo.Alignment.Alignment;
import com.dungeonsanddragons.monstercreator.demo.Alignment.AlignmentService;
import com.dungeonsanddragons.monstercreator.demo.ConditionImmunities.ConditionImmunities;
import com.dungeonsanddragons.monstercreator.demo.ConditionImmunities.ConditionImmunitiesService;
import com.dungeonsanddragons.monstercreator.demo.DamageImmunities.DamageImmunities;
import com.dungeonsanddragons.monstercreator.demo.DamageImmunities.DamageImmunitiesService;
import com.dungeonsanddragons.monstercreator.demo.DamageResistance.DamageResistance;
import com.dungeonsanddragons.monstercreator.demo.DamageResistance.DamageResistanceService;
import com.dungeonsanddragons.monstercreator.demo.Features.Features;
import com.dungeonsanddragons.monstercreator.demo.Features.FeaturesService;
import com.dungeonsanddragons.monstercreator.demo.Languages.LanguageService;
import com.dungeonsanddragons.monstercreator.demo.Languages.Languages;
import com.dungeonsanddragons.monstercreator.demo.LegendaryActions.LegendaryActionService;
import com.dungeonsanddragons.monstercreator.demo.LegendaryActions.LegendaryActions;
import com.dungeonsanddragons.monstercreator.demo.Senses.Senses;
import com.dungeonsanddragons.monstercreator.demo.Senses.SensesService;
import com.dungeonsanddragons.monstercreator.demo.Size.Size;
import com.dungeonsanddragons.monstercreator.demo.Size.SizeService;
import com.dungeonsanddragons.monstercreator.demo.Skills.Skills;
import com.dungeonsanddragons.monstercreator.demo.Skills.SkillsService;
import com.dungeonsanddragons.monstercreator.demo.Type.Type;
import com.dungeonsanddragons.monstercreator.demo.Type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CardController {

    private CardService cardService;
    private LanguageService languageService;
    private SizeService sizeService;
    private TypeService typeService;
    private AlignmentService alignmentService;
    private SkillsService skillsService;
    private ConditionImmunitiesService conditionImmunitiesService;
    private DamageResistanceService damageResistanceService;
    private DamageImmunitiesService damageImmunitiesService;
    private SensesService sensesService;
    private LegendaryActionService legendaryActionService;
    private FeaturesService featuresService;
    private ActionService actionService;

    @Autowired
    public CardController(CardService cardService, LanguageService languageService,
                          SizeService sizeService, TypeService typeService,
                          AlignmentService alignmentService, SkillsService skillsService,
                          ConditionImmunitiesService conditionImmunitiesService,
                          DamageResistanceService damageResistanceService,
                          DamageImmunitiesService damageImmunitiesService, SensesService sensesService,
                          LegendaryActionService legendaryActionService, FeaturesService featuresService,
                          ActionService actionService) {

        this.cardService = cardService;
        this.languageService = languageService;
        this.sizeService = sizeService;
        this.typeService = typeService;
        this.alignmentService = alignmentService;
        this.skillsService = skillsService;
        this.conditionImmunitiesService = conditionImmunitiesService;
        this.damageResistanceService = damageResistanceService;
        this.damageImmunitiesService = damageImmunitiesService;
        this.sensesService = sensesService;
        this.legendaryActionService = legendaryActionService;
        this.featuresService = featuresService;
        this.actionService = actionService;
    }

    @GetMapping("/")
    public String statBlock(){
        return "statBlock";
    }

    @GetMapping("/showLanguages")
    @ResponseBody
    public List<Languages> showLanguages(){
        return languageService.showLanguage();
    }

    @GetMapping("/showSize")
    @ResponseBody
    public List<Size> showSize(){return sizeService.showSize();}

    @GetMapping("/showType")
    @ResponseBody
    public List<Type> showType(){return typeService.showType();}

    @GetMapping("/showAlignment")
    @ResponseBody
    public List<Alignment> showAlignment(){
        return alignmentService.showAlignment();
    }

    @GetMapping("/showSkills")
    @ResponseBody
    public List<Skills> showSkills(){
        return skillsService.showSkills();
    }

    @GetMapping("/showConditionImmunities")
    @ResponseBody
    public List<ConditionImmunities> showConditionImmunities(){
        return conditionImmunitiesService.showContitionImmunities();
    }

    @GetMapping("/showDamageResistance")
    @ResponseBody
    public List<DamageResistance> showDamageResistance(){
        return damageResistanceService.showDamageResistance();
    }

    @GetMapping("/showDamageImmunities")
    @ResponseBody
    public List<DamageImmunities> showDamageImmunities(){
        return damageImmunitiesService.showDamageImmunities();
    }

    @GetMapping("/showSenses")
    @ResponseBody
    public List<Senses> showSenses(){
        return sensesService.showSenses();
    }

    @GetMapping("/showLegendaryAction")
    @ResponseBody
    public  List<LegendaryActions> showLegendaryAction(){
        return legendaryActionService.showLegendaryAction();
    }

    @GetMapping("/showFeatures")
    @ResponseBody
    public List<Features> showFeatures(){
        return featuresService.showFeatures();
    }

    @GetMapping("/showAction")
    @ResponseBody
    public List<Actions> showAction(){
        return actionService.showAction();
    }

    @PostMapping("/addStatblock")
    @ResponseBody
    public Card addStatblock(@RequestBody CardRequest req) {
        Card card = new Card();

        card.setName(req.getName());
        card.setArmorClass(req.getArmorClass());
        card.setHitPoints(req.getHitPoints());
        card.setSpeed(req.getSpeed());
        card.setStrength(req.getStrength());
        card.setDexterity(req.getDexterity());
        card.setConstitution(req.getConstitution());
        card.setIntelligence(req.getIntelligence());
        card.setWisdom(req.getWisdom());
        card.setCharisma(req.getCharisma());
        card.setCr(req.getCr());
        card.setProficiencyBonus(req.getProficiencyBonus());

        card.setSize(sizeService.findById(req.getSizeId()));
        card.setType(typeService.findById(req.getTypeId()));
        card.setAlignment(alignmentService.findById(req.getAlignmentId()));

        card.setSkills(skillsService.findAllById(req.getSkills()));
        card.setDamageResistance(damageResistanceService.findAllById(req.getDamageResistance()));
        card.setDamageImmunities(damageImmunitiesService.findAllById(req.getDamageImmunities()));
        card.setConditionImmunities(conditionImmunitiesService.findAllById(req.getConditionImmunities()));
        card.setSenses(sensesService.findAllById(req.getSenses()));
        card.setLanguages(languageService.findAllById(req.getLanguages()));
        card.setFeatures(featuresService.findAllById(req.getFeatures()));
        card.setActions(actionService.findAllById(req.getActions()));
        card.setLegendaryActions(legendaryActionService.findAllById(req.getLegendaryActions()));

        return cardService.addStatblock(card);
    }

    @GetMapping("/cards")
    @ResponseBody
    public List<Card> getAllCards(){
        return cardService.getAllCards();
    }
    @GetMapping("/card/{id}")
    public String viewCard(@PathVariable Long id, Model model) {
        Card card = cardService.getCard(id)
                .orElseThrow(() -> new RuntimeException("Card not found"));

        model.addAttribute("card", card);
        return "viewCard";
    }
}
