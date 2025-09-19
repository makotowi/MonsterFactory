document.addEventListener("DOMContentLoaded", function (){


    function addLanguage() {
        const conditionImmunitiesForm = document.getElementById("conditionImmunitiesCreator");
        conditionImmunitiesForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newConditionImmunities = {
                name: document.getElementById("ciname").value
            };

            fetch("/addConditionImmunities", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newConditionImmunities)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json()
                    } else {
                        throw new Error("No add condition immunities")
                    }
                })
                .then(data =>{
                    console.log("Condition Immunities added")
                })
        })
    }
    addLanguage()
})