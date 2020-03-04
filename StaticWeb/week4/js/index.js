$(document).ready(function () {
    $("#footImg li").hover(function () {
        let img = $(this).find("img").attr("src");
        $("#main").attr("src", img);
    });

    let imgList = [];
    $("#footImg img").each(
        function (i, ele) {
            imgList[i] = $(ele).attr("src");
        }
    );

    let index = 0;
    setInterval(function () {
        if (index === imgList.length - 1) {
            index = 0;
        } else {
            index++;
        }
        $("#main").attr("src", imgList[index]);
    }, 1000);
});