document.addEventListener("DOMContentLoaded", function (){
    function addAction(){
        const actionForm = document.getElementById("actionCreator");
        actionForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newAction = {
                name: document.getElementById("acname").value,
                description: document.getElementById("acdesc").value
            };

            fetch("/addAction", {
                method: "POST",
                headers: {"Content-Type" : "application/json"},
                body: JSON.stringify(newAction)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json()
                    } else {
                        throw new Error("No add action")
                    }
                })
                .then(data =>{
                    console.log("Action added")
                })
        })
    }
    addAction()
})