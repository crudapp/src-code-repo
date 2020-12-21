$("#site-name").click(function (event) {
	$("#headerForm").attr("action", "crud");
	$("#headerForm").submit();
});

/*body - begin*/
$("body").on("click", "div.soft-mask", function (event) {
    hideDialogs();
    removeMasks();
});
/*body - end*/

/*mask - begin*/
function addSoftMask(titleCaption) {
    var maskDiv = '<div class="soft-mask" title=' + "'" + titleCaption + "'" + '></div>';
    $('body').append(maskDiv);
    $('.soft-mask').fadeIn("fast");
}

function removeMasks() {
    $('.soft-mask').remove();
}
/*mask - end*/

/*hide dlg - begin*/
function hideDialogs() {
	$(".del-confirm-dlg").hide();
	$(".user-update-dlg").hide();
}
/*hide dlg - end*/