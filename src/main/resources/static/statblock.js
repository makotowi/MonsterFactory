document.addEventListener("DOMContentLoaded", function (){

    document.querySelectorAll(".add-field").forEach(btn => {
        btn.addEventListener("click", function (){
            const container = btn.parentElement;
            const select = container.querySelector("select");

            const newSelect = select.cloneNode(true);
            newSelect.value = "";

           container.insertBefore(newSelect, btn);
        });
    })




    fetch("showLanguages")
        .then(response => response.json())
        .then(date =>{
            const languageSelect = document.getElementById("languages");

            date.forEach(lang => {
                const option = document.createElement("option");
                option.value = lang.id;
                option.textContent = lang.name;
                languageSelect.appendChild(option.cloneNode(true));
            });
        })
        .catch(error => console.error("Error loading language: ", error))

    fetch("showSize")
        .then(response => response.json())
        .then(data =>{
            const sizeSelect = document.getElementById("size");

            data.forEach(size =>{
                const option = document.createElement("option");
                option.value = size.id;
                option.textContent = size.name;
                sizeSelect.appendChild(option);
            });
        })
        .catch(error => console.error("Error loading size", error))

    fetch("showType")
        .then(response => response.json())
        .then(data =>{
            const typeSelect = document.getElementById("type");

            data.forEach(type =>{
                const option = document.createElement("option");
                option.value = type.id;
                option.textContent = type.name;
                typeSelect.appendChild(option);
            })
                .catch(error => console.log("Error loading type", error))
        })

    fetch("showAlignment")
        .then(response =>response.json())
        .then(data =>{
            const alignmentSelect = document.getElementById("alignment");

            data.forEach(alignment =>{
                const option = document.createElement("option");
                option.value = alignment.id;
                option.textContent = alignment.name;
                alignmentSelect.appendChild(option);
            })
                .catch(error => console.log("Error loading alignment", error))
        })

    fetch("showSkills")
        .then(response => response.json())
        .then(data =>{
            const skillSelect = document.getElementById("skills");

            data.forEach(skills =>{
                const option = document.createElement("option");
                option.value = skills.id;
                option.textContent = skills.name;
                skillSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading language: ", error))
        })

    fetch("showConditionImmunities")
        .then(response => response.json())
        .then(data =>{
            const conditionImmunitiesSelect = document.getElementById("conditionImmunities");

            data.forEach(conditionImmunities =>{
                const option = document.createElement("option");
                option.value = conditionImmunities.id;
                option.textContent = conditionImmunities.name;
                conditionImmunitiesSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading condition immunities: ", error))
        })

    fetch("showDamageResistance")
        .then(response => response.json())
        .then(data =>{
            const damageResistanceSelect = document.getElementById("damageResistance");

            data.forEach(damageResistance =>{
                const option = document.createElement("option");
                option.value = damageResistance.id;
                option.textContent = damageResistance.name;
                damageResistanceSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading damage resistance: ", error))
        })

    fetch("showDamageImmunities")
        .then(response => response.json())
        .then(data =>{
            const damageImmunitiesSelect = document.getElementById("damageImmunities");

            data.forEach(damageImmunities =>{
                const option = document.createElement("option");
                option.value = damageImmunities.id;
                option.textContent = damageImmunities.name;
                damageImmunitiesSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading damage immunities: ", error))
        })

    fetch("showSenses")
        .then(response => response.json())
        .then(data =>{
            const sensesSelect = document.getElementById("senses");

            data.forEach(senses =>{
                const option = document.createElement("option");
                option.value = senses.id;
                option.textContent = senses.name + " " + senses.range + "ft";
                sensesSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading senses: ", error))
        })

    fetch("showLegendaryAction")
        .then(response => response.json())
        .then(data =>{
            const legendaryActionSelect = document.getElementById("legendaryActions");

            data.forEach(legendaryAction =>{
                const option = document.createElement("option");
                option.value = legendaryAction.id;
                option.textContent = legendaryAction.name;
                option.title = legendaryAction.description;
                legendaryActionSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading legendary action: ", error))
        })

    fetch("showFeatures")
        .then(response => response.json())
        .then(data =>{
            const featuresSelect = document.getElementById("features");

            data.forEach(features =>{
                const option = document.createElement("option");
                option.value = features.id;
                option.textContent = features.name;
                option.title = features.description;
                featuresSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading features: ", error))
        })

    fetch("showAction")
        .then(response => response.json())
        .then(data =>{
            const actionSelect = document.getElementById("actions");

            data.forEach(action =>{
                const option = document.createElement("option");
                option.value = action.id;
                option.textContent = action.name;
                option.title = action.description;
                actionSelect.appendChild((option.cloneNode(true)));
            })
                .catch(error => console.error("Error loading action: ", error))
        })

    function addStatblock(){
        const statblockForm = document.getElementById("monsterStatblock");
        statblockForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newStatblock = {
                name: document.getElementById("name").value,
                size: document.getElementById("size").value,
                type: document.getElementById("type").value,
                alignment: document.getElementById("alignment").value,
                armorClass: document.getElementById("armorClass").value,
                hitPoints: document.getElementById("hitPoints").value,
                speed: document.getElementById("speed").value,
                strength: document.getElementById("strength").value,
                dexterity: document.getElementById("dexterity").value,
                constitution: document.getElementById("constitution").value,
                intelligence: document.getElementById("intelligence").value,
                wisdom: document.getElementById("wisdom").value,
                charisma: document.getElementById("charisma").value,
                skills: document.getElementById("skills").value,
                damageResistance: document.getElementById("damageResistance").value,
                damageImmunities: document.getElementById("damageImmunities").value,
                conditionImmunities: document.getElementById("conditionImmunities").value,
                senses: document.getElementById("senses").value,
                languages: document.getElementById("languages").value,
                cr: document.getElementById("cr").value,
                proficiencyBonus: document.getElementById("proficiencyBonus").value,
                features: document.getElementById("features").value,
                actions: document.getElementById("actions").value,
                legendaryActions: document.getElementById("legendaryActions").value
            };

            fetch("/addStatblock", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newStatblock)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json();
                    } else {
                        throw new Error("No add statblock")
                    }
                })
                .then(date => {
                    console.log("Statblock added")
                })
        })
    }
    addStatblock();
})