document.addEventListener("DOMContentLoaded", function (){

    function addSize(){
        const sizeForm = document.getElementById("SizeCreator");
        sizeForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newSize = {
                name: document.getElementById("sname").value
            };

            fetch("/addSize", {
                method: "POST",
                headers:{"Content-Type": "application/json"},
                body: JSON.stringify(newSize)
            })
                .then(response =>{
                    if (response.ok){
                        return response.json();
                    }
                    else {
                        throw new Error("no add Size")
                    }
                })
                .then(data =>{
                    console.log("Size added")
                })
        })
    }

    addSize()

})