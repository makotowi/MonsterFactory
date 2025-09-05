document.addEventListener("DOMContentLoaded", function (){
    fetch("showLanguages")
        .then(response => response.json())
        .then(date =>{
            const languageSelect = document.getElementById("languages");

            date.forEach(lang => {
                const option = document.createElement("option");
                option.value = lang.id;
                option.textContent = lang.name;
                languageSelect.appendChild(option);
            });
        })
        .catch(error => console.error("Error loading language: ", error))
})