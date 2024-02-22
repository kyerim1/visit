$(function(){
    $("#content").focus();

    $("#content").on("focus",removeError);
    $("#writer").on("focus", removeError);
    $(".error").on("click",removeError);
    $("#content").on("blur",addError);
    $("#writer").on("blur", addError);
});
function removeError(){
    if( $(this).hasClass("error") ){
        $(this).hide();
        $(this).prev().focus();
    }else{
        var hasError = $(this).next().hasClass("error");
        if( hasError)    $(this).next().hide();
    }
}
function addError(){
 var hasError = $(this).next().hasClass("error");
 if( hasError && $(this).val()==''){
         $(this).next().show();
     }
}