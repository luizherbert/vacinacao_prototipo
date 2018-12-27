var $menu = $("#my-menu").mmenu({
     extensions: ["theme-dark"]
 });

 var $icon = $("#my-icon");
 var API = $menu.data("mmenu");
 var i = 0;

 $icon.on("click", function() {
     if (i == 0) {
        API.close();i++;

     } else {
        API.open();i = 0;
     }
 });

 API.bind("open:finish", function() {
     setTimeout(function() {
         $icon.addClass("is-active");
     }, 10);
 });
 API.bind("close:finish", function() {
     setTimeout(function() {
         $icon.removeClass("is-active");
     }, 10);
 });

 $(document).ready(function() {
     API.open();
     $('.mm-wrapper__blocker').remove();

 });