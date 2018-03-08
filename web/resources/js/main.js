$(document).ready(function() {

    $(".entry").hover(function() {
        $(this).css('outline-color', 'blue');
    }, function() {
        $('.entry').css('outline-color', 'green');
    });

});