document.addEventListener("DOMContentLoaded", function (){
    function addSkill(){
        const skillForm = document.getElementById("SkillCreator");
        skillForm.addEventListener("submit", function (e){
            e.preventDefault();

            const newSkill = {
                name: document.getElementById("sname").value
            };

            fetch("/addSkill", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newSkill)
            })
                .then(response => {
                    if (response.ok){
                        return response.json();
                    }else {
                        throw new Error("No add skill")
                    }
                })
                .then(date =>{
                    console.log("Skill added")
                })
        })
    }
    addSkill()
})