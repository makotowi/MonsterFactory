document.addEventListener("DOMContentLoaded", function (){

    function addFeatures(){
        const featuresForm = document.getElementById("featuresCreator");
        featuresForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newFeatures = {
                name: document.getElementById("fname").value,
                description: document.getElementById("fdesc").value
            };

            fetch("/addFeatures", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newFeatures)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json();
                    } else {
                        throw new Error("No add features")
                    }
                })
                .then(data =>{
                    console.log("Features added")
                })
        })
    }
    addFeatures();
})