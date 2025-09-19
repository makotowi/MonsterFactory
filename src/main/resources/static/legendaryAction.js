document.addEventListener("DOMContentLoaded", function () {
    function addLegendaryAction() {

        const legendaryActionForm = document.getElementById("legendaryActionCreator");
        legendaryActionForm.addEventListener("submit", function (e) {
            e.preventDefault();

            const newLegendaryAction = {
                name: document.getElementById("laname").value,
                description: document.getElementById("ladesc").value
            };

            fetch("/addLegendaryAction", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newLegendaryAction)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json();
                    }else {
                        throw new Error("No add legendary action ")
                    }
                })
                .then(data => {
                    console.log("Legendary action added")
                })
        })
    }
    addLegendaryAction();
})