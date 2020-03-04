function validateName(data) {
    var name = data.value;
    var regex = /^[A-Za-z]+$/;
    if (!name.match(regex)) {
        console.log(name);
        document.forms[0].addEventListener("submit", validateForm);
    }
}


function validateDate() {
    var date = new Date(document.getElementById("birthday").value);
    var dateMax = new Date(2018, 1, 1);
    var dataMin = new Date(1991, 1, 1)
    if (date.getTime > dateMax.getTime || date.getTime() < dataMin.getTime()) {
        window.alert("wrong date")
    }
}

function validateForm() {
    // var date = document.getElementById("date").value;
    return false;
}

// When the user clicks on the button, open the modal
function abc() {
    console.log("abc exec")
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal

function bcd() {
    console.log("bcd ----");
    modal.style.display = "none";
}

function cde(event) {
    console.log("cde  ----");
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

var modal;
window.onload = function load() {
// Get the modal
    modal = document.getElementById("myModal");

// Get the button that opens the modal
    var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];

    if (btn)
        btn.addEventListener("click", abc);

    if (span) {
        console.log(span);
        span.addEventListener("click", bcd);
    }
// When the user clicks anywhere outside of the modal, close it
    window.addEventListener("click", cde);

    var town = document.getElementsByClassName("town");
    town[0].addEventListener("click", promptInfo);
}

function promptInfo() {
    var population = prompt("Insert the population", "1000");
    var numRegex = /^[0-9]+$/;
    if (population != null && population.match(numRegex)) {
        document.getElementById("pop").innerHTML = population;
    }
    var sqm = prompt("Insert the sqm", "1000");
    document.getElementById("pop2").innerHTML = sqm;
}