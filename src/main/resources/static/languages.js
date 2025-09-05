document.addEventListener("DOMContentLoaded", function (){


    function addLanguage() {
        const languageForm = document.getElementById("languagesCreator");
        languageForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newLanguage = {
                name: document.getElementById("lname").value
            };

            fetch("/addLanguage", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newLanguage)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json()
                    } else {
                        throw new Error("No add language")
                    }
                })
                .then(data =>{
                    console.log("Language added")
                })
        })
    }
    addLanguage()
})