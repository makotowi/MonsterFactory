document.addEventListener("DOMContentLoaded", function (){

    function addAlignment(){
        const alignmentForm = document.getElementById("AlignmentCreator");
        alignmentForm.addEventListener("submit", function (e){
            e.preventDefault();

            const  newAlignment = {
                name: document.getElementById("aname").value
            };

            fetch("/addAlignment", {
                method: "POST",
                headers: {"Content-Type":"application/json"},
                body: JSON.stringify(newAlignment)
            })
                .then(response => {
                    if (response.ok){
                        return response.json()
                    } else {
                        throw new Error("No add alignment")
                    }
                })
                .catch(date =>{
                    console.log("Alignment added")
                })
        })
    }
    addAlignment()
})