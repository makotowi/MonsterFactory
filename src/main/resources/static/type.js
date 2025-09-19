document.addEventListener("DOMContentLoaded", function (){


    function addType(){
        const typeForm = document.getElementById("TypeCreator");
        typeForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newType = {
                name: document.getElementById("tname").value
            };

            fetch("/addType", {
                method: "POST",
                headers: {"Content-Type":"application/json"},
                body: JSON.stringify(newType)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json();
                    }
                    else {
                        throw new Error("no add type")
                    }
                })
                .then(date =>{
                    console.log("Type added")
                })
        })
    }
    addType()
})