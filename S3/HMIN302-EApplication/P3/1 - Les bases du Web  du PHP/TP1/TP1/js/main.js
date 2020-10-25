$(document).ready(function() {
    "use strict";
    $("ul li:first-child").css("font-weight", "Bold");
    
    $(".description").insertBefore($("section#tp1-1 ul"));

    $("input").focusout(function(){
        alert("User typed : " + $(this).val());
    });

    $(".todo").fadeOut(5000);

    $("ul#chuck").remove();
    $("ul#chuck").load("./chuck.html");
    //$.ema();
});
