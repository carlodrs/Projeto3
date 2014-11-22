

$(function() {
	
	$('.clearBtn').click(function(){
		$("#UserAction").attr("action", "prepareCreate");
		$("#UserAction").submit();
	});
	
	$('.submitBtn').click(function(){
	
			
		var hasError = false;
		
		if ($.trim($("#name").val()) == ''){
			addErrorData($("#name"), 'Informe seu nome.', 1);
			hasError = true;
		}else{
			removeErrorData($("#name"), 1);
		}
	
		if ($.trim($("#birthday").val()) == ''){
			addErrorData($("#birthday"), 'Informe sua data de nascimento.', 2);
			hasError = true;
		}else{
			removeErrorData($("#birthday"), 2);
		}
	
		if ($.trim($("#nationality").val()) == ''){
			addErrorData($("#nationality"), 'Informe sua nacionalidade, por exemplo Brasileiro, Argentino, etc.', 3);
			hasError = true;
		}else{
			removeErrorData($("#nationality"), 3);
		}
	
		if ($.trim($("#rg").val()) == ''){
			addErrorData($("#rg"), 'Informe seu RG.', 4);
			hasError = true;
		}else{
			removeErrorData($("#rg"), 4);
		}
		
	
		if ($.trim($("#cpf").val()) == ''){
			addErrorData($("#cpf") , 'Informe seu CPF.', 5);
			hasError = true;
		}else{
			removeErrorData($("#cpf"), 5);
		}
		
		if ($.trim($("#email").val()) == ''){
			addErrorData($("#email"), 'Informe seu email', 6);
			hasError = true;
		}else{
			removeErrorData($("#email"), 6);
		}
		
		if ($.trim($("#street").val()) == ''){
			addErrorData($("#street"), 'Informe sua localidade (Rua, Avenida, outros.)', 7);
			hasError = true;
		}else{
			removeErrorData($("#street"), 7);
		}
	
		if ($.trim($("#streetNumber").val()) == ''){
			addErrorData($("#streetNumber"), 'Informe o número.', 8);
			hasError = true;
		}else{
			removeErrorData($("#streetNumber"), 8);
		}
	
		if ($.trim($("#zipCode").val()) == ''){
			addErrorData($("#zipCode"), 'Informe o cep de sua localidade.', 9);
			hasError = true;
		}else{
			removeErrorData($("#zipCode"), 9);
		}
	
		if ($.trim($("#city").val()) == ''){
			addErrorData($("#city"), 'Informe a cidade.', 10);
			hasError = true;
		}else{
			removeErrorData($("#city"), 10);
		}
	
		if ($.trim($("#phone").val()) == ''){
			addErrorData($("#phone"), 'Informe o telefone de contato.', 11);
			hasError = true;
		}else{
			removeErrorData($("#phone"), 11);
		}
	
		if ($.trim($("#mobile").val()) == ''){
			addErrorData($("#mobile"),'Informe o seu número de celular.', 12);
			hasError = true;
		}else{
			removeErrorData($("#mobile"), 12);
		}
		
		if (hasError)
			return false;
		else
			$("#UserAction").submit();
		
	});
});

function addErrorData(element, message, index) {
	removeErrorData(element, index);
	element.parent().addClass("error");
	element.before("<div id=" + index + " class='error-data'>" + message + "</div>");
}

function removeErrorData(element, index) {
	var elementName = "#" + index;
	element.parent().removeClass("error");
	$(elementName).remove();
}