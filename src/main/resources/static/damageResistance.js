document.addEventListener("DOMContentLoaded", function (){
    function addDamageResistance(){
        const damageResistanceForm = document.getElementById("damageResistanceCreator");
        damageResistanceForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newDamageResistance = {
                name: document.getElementById("drname").value
            };

            fetch("/addDamageResistance", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newDamageResistance)
            })
                .then(response => {
                    if (response.ok){
                        return response.json();
                    } else {
                        throw new Error("No add Damage Resistance")
                    }
                })
                .then(date=>{
                    console.log("Damage Resistance added")
                })
        })
    }
    addDamageResistance();
})