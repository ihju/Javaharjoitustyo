let list = document.querySelector("ul")

//Getting list of opiskelijat when opening the webpage
getOpiskelijat()
getKurssit()

//Form button action.
document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    //Creating blog object from the form information
    let opiskelijat = {
        etunimi: document.getElementById("etn").value,
        sukunimi: document.getElementById("skn").value,
        osoite: document.getElementById("oso").value

    }

    //Posting the object as JSON to server
    //After posting getting the updated list of blogs from the server
    fetch("http://localhost:8080/addopiskelija",
        {
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(opiskelijat)
        })
        .then(resp => getOpiskelijat())
})

document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    //Creating blog object from the form information
    let kurssit = {
        kurssinNimi: document.getElementById("kn").value,
        luokka: document.getElementById("lk").value,
        opettaja: document.getElementById("ope").value

    }

    //Posting the object as JSON to server
    //After posting getting the updated list of blogs from the server
    fetch("http://localhost:8080/addkurssi",
        {
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(kurssit)
        })
        .then(resp => getKurssit())
})


//Function for getting all the opiskelijat
function getOpiskelijat()
{
    //Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the blogs from the server
    fetch("http://localhost:8080/opiskelijat")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each blog object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.etunimi + " " + i.sukunimi
            list.appendChild(li)
        })
    })
}

function getKurssit()
{
//Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the blogs from the server
    fetch("http://localhost:8080/kurssit")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each blog object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.kurssinNimi + ": " + i.opettaja
            list.appendChild(li)
        })
    })
}