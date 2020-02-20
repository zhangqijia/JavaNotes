function openFile(obj) {
    var tag = obj.title;
    var frame = document.getElementById("frame");

    frame.style.display = "block";
    frame.src = tag;

}