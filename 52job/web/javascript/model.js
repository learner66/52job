i=0;
$(document).ready(function () {

    $(".management").click(function () {
        // alert("hello world");
        if (i == 0) {

            $(".existinfo,.roughinfo,.pastinfo").show();

            i = 1;
        } else {
            $(".existinfo,.roughinfo,.pastinfo").hide();

            i = 0;
        }

    });
})