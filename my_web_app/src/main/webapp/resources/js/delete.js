function showDelConfirm(userId) {
	addSoftMask("Delete");
	$("#userId").val(userId);
	$(".del-confirm-dlg").show();
}

function confirmDelete(userId) {
	$("#delForm").attr("action", "delete-rec");
	$("#delForm").submit();
}


function cancelDelete() {
    hideDialogs();
    removeMasks();
    return false;
}