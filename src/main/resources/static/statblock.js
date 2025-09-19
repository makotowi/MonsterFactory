document.addEventListener("DOMContentLoaded", function (){

    document.querySelectorAll(".add-field").forEach(btn => {
        btn.addEventListener("click", function (){
            const container = btn.parentElement;
            const select = container.querySelector("select");

            const newSelect = select.cloneNode(true);
            newSelect.value = "";

           container.insertBefore(newSelect, btn);
        });
    });

    function collectSelectIds(selector) {
        return Array.from(document.querySelectorAll(selector))
            .filter(select => select.value)
            .map(select => Number(select.value));
    }




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
                sizeId: parseInt(document.getElementById("size").value),
                typeId: parseInt(document.getElementById("type").value),
                alignmentId: parseInt(document.getElementById("alignment").value),
                armorClass: Number(document.getElementById("armorClass").value),
                hitPoints: Number(document.getElementById("hitPoints").value),
                speed: Number(document.getElementById("speed").value),
                strength: Number(document.getElementById("strength").value),
                dexterity: Number(document.getElementById("dexterity").value),
                constitution: Number(document.getElementById("constitution").value),
                intelligence: Number(document.getElementById("intelligence").value),
                wisdom: Number(document.getElementById("wisdom").value),
                charisma: Number(document.getElementById("charisma").value),
                cr: Number(document.getElementById("cr").value),
                proficiencyBonus: Number(document.getElementById("proficiencyBonus").value),
                skills: collectSelectIds("#skills"),
                damageResistance: collectSelectIds("#damageResistance"),
                damageImmunities: collectSelectIds("#damageImmunities"),
                conditionImmunities: collectSelectIds("#conditionImmunities"),
                senses: collectSelectIds("#senses"),
                languages: collectSelectIds("#languages"),
                features: collectSelectIds("#features"),
                actions: collectSelectIds("#actions"),
                legendaryActions: collectSelectIds("#legendaryActions")
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
                    console.log("Statblock added");

                    statblockForm.reset();

                    document.querySelectorAll(".add-field").forEach(btn => {
                        const selects = btn.parentElement.querySelectorAll("select");
                        if (selects.length > 1) {
                            for (let i = 1; i < selects.length; i++){
                                selects[i].remove();
                            }
                        }
                    })
                })
        })
    }
    addStatblock();



    const sidebar = document.getElementById("sidebar");
    const toggleBtn = document.getElementById("toggleSidebar");
    const cardList = document.getElementById("cardList");

    toggleBtn.addEventListener("click", () => {
        sidebar.classList.toggle("open");
        toggleBtn.textContent = sidebar.classList.contains("open") ? "⇨" : "⇦";

        if (sidebar.classList.contains("open")) {
            loadCards();
        }
    });

    function loadCards() {
        fetch("/cards")
            .then(res => res.json())
            .then(data => {
                cardList.innerHTML = "";
                data.forEach(card => {
                    const li = document.createElement("li");
                    li.className = "list-group-item d-flex justify-content-between align-items-center";
                    li.textContent = card.name + " (CR " + card.cr + ")";

                    const btn = document.createElement("button");
                    btn.className = "btn btn-sm btn-outline-primary";
                    btn.textContent = "OPEN";
                    btn.onclick = () => {
                        window.location.href = "/card/" + card.id;
                    };

                    li.appendChild(btn);
                    cardList.appendChild(li);
                });
            })
            .catch(err => console.error("Error loading cards", err));
    }
})