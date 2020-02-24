function validateName() {
    var name = window.event.target.value;
    var regex = /^[A-Za-z]+$/;
    console.log(typeof name);
    console.log(name.match(regex));
    if (!name.match(regex)) {
        return false;
    }
}

function validateDate() {

}

function validateForm() {
    var date = document.getElementById("date").value;

}