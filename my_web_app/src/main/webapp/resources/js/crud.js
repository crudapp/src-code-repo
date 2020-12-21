function create() {
	$("#crudForm").attr("action", "display-create-page");
	$("#crudForm").submit();    
}


function read() {
	$("#crudForm").attr("action", "display-read-page");
	$("#crudForm").submit();    
}

function update() {
	$("#crudForm").attr("action", "display-update-page");
	$("#crudForm").submit();    
}

function delRec() {
	$("#crudForm").attr("action", "display-delete-page");
	$("#crudForm").submit();    
}

function searchUser() {
	$("#crudForm").attr("action", "search");
	$("#crudForm").submit();    
}
