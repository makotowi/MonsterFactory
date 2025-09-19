document.addEventListener("DOMContentLoaded", function (){
    function addDamageImmunities() {
        const damageImmunitiesForm = document.getElementById("damageImmunitiesCreator");
        damageImmunitiesForm.addEventListener("submit", function (e) {
            e.preventDefault();

            const newDamageImmunities = {
                name: document.getElementById("diname").value
            };

            fetch("addDamageImmunities", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newDamageImmunities)
            })
                .then(response => {
                    if (response.ok) {
                        return response.json();
                    } else {
                        throw new Error("No add damage immunities")
                    }
                })
                .then(date => {
                    console.log("Damage immunities added")
                })
        })
    }
    addDamageImmunities();
})