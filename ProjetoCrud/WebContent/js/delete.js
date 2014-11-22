function prepareDelete(){
	$("#UserAction").attr('action', 'prepareDelete');
	$("#UserAction").submit();
}

function redirect(actionName){
	$("#UserAction").attr('action', actionName);
	$("#UserAction").submit();
}

function deleteUser(){
	$("#UserAction").attr('action', 'delete');
	$("#UserAction").submit();
}


function readUserForDelete(){
	$("#UserAction").attr('action', 'readUserForDelete');
	$("#UserAction").submit();
}

function confirmDelete(){
	$("#UserAction").attr('action', 'confirmDelete');
	$("#UserAction").submit();
}
