document.addEventListener("DOMContentLoaded", function (){
    function addSenses(){
        const sensesForm = document.getElementById("sensesCreator");
        sensesForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newSenses = {
                name: document.getElementById("sname").value,
                range: document.getElementById("srange").value
            };

            fetch("/addSenses", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newSenses)
            })
                .then(response => {
                    if (response.ok){
                        return response.json();
                    } else {
                        throw new Error("No add Senses")
                    }
                })
                .then(data => {
                    console.log("Senses added");
                })
        })
    }
    addSenses();
})