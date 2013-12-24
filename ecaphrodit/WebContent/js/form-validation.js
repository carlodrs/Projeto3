jQuery(document).ready(function($) {

	// hide messages 
	$("#error").hide();
	$("#success").hide();
	
	// on submit...
	$("#contactForm #submit").click(function() {
		$("#error").hide();
		
		//required:
		
		//name
		var name = $("input#name").val();
		if(name == ""){
			$("#error").fadeIn().text("Informe seu nome.");
			$("input#name").focus();
			return false;
		}
		

		// email
		var email = $("input#email").val();
		if(email == ""){
			$("#error").fadeIn().text("Informe seu email.");
			$("input#email").focus();
			return false;
		}
		//birthday
		var birthday = $("input#birthday").val();
		if(birthday == ""){
			$("#error").fadeIn().text("Informe a data de nascimento");
			$("input#birthday").focus();
			return false;
		}
		
		// phone
		var phone = $("input#phone").val();
		if(phone == ""){
			$("#error").fadeIn().text("Informe o telefone para contato");
			$("input#phone").focus();
			return false;
		}
		
		// period
		var period = $("input#period").val();
		if(phone == ""){
			$("#error").fadeIn().text("Informe o periodo para contato");
			$("input#period").focus();
			return false;
		}
		

		// comments
		var comments = $("#comments").val();
		
		// send mail
		var sendMailUrl = $("#sendMailUrl").val();
		
		// data string
		var dataString = 'contact.fullName='+ name
						+ '&contact.email=' + email        
						+ '&contact.phone=' + phone
						+ '&contact.period=' + period
						+ '&contact.birthday=' + birthday 
						+ '&contact.comments=' + comments;
		
		// ajax
		$.ajax({
			type:"POST",
			url: sendMailUrl,
			data: dataString,
			success: success(name)
		});
	});  
		
		
	// on success...
	 function success(name){
		 $.scrollTo( {top:'0px', left:'0px'}, 300 );
		 $("#nameShow").text(name);
		 $("#success").fadeIn();
	 	 $("#contactForm").fadeOut();
	 }
	
    return false;
});

