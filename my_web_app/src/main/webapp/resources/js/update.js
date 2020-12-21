function clearSelected() {
	
	var elements = document.getElementById("single-select-id").options;
    for(var i = 0; i < elements.length; i++){
      if(elements[i].selected)
	    elements[i].selected = false;
    }	
	
	elements = document.getElementById("multi-select-id").options;
    for(var i = 0; i < elements.length; i++){
      if(elements[i].selected)
	    elements[i].selected = false;
    }
}

function showUserUpdateDlg(userId, name, address, diet, hobbies, languages, gender) {
	
	console.log(userId);
	console.log(name);
	console.log(address);
	console.log(diet);
	console.log(hobbies);
	console.log(languages);
	console.log(gender);
	
	addSoftMask("Edit");
	clearSelected();
	
	$("#userId").val(userId);

	//text box
	$("#textbox-id").val(name);
	
	//textarea box
	$("#textareabox-id").val(address);
	
	//single-select
	document.getElementById(diet.trim()).selected = "true";
	
	//multi-select
	var splitArray = hobbies.split(",");
	for (i=0;i<splitArray.length;i++) {
		document.getElementById(splitArray[i].trim()).selected = "true";
	}	
	
	//check box
	document.getElementById("checkbox1").checked = false;
	document.getElementById("checkbox2").checked = false;
	document.getElementById("checkbox3").checked = false;	
	splitArray = languages.split(",");
	for (i=0;i<splitArray.length;i++) {
		if(splitArray[i]=='Tamil') {
			document.getElementById("checkbox1").checked = true;
		}
		if(splitArray[i]=='English') {
			document.getElementById("checkbox2").checked = true;
		}		
		if(splitArray[i]=='French') {
			document.getElementById("checkbox3").checked = true;
		}	
	}

	//radio button
	if(gender == 'Male') {
		document.getElementById("radio1").checked = true;
	}
	if(gender == 'Female') {
		document.getElementById("radio2").checked = true;
	}		
	if(gender == 'Neutral') {
		document.getElementById("radio3").checked = true;	
	}			
	
	$(".user-update-dlg").show();

}