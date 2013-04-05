jQuery(document).ready(function($) {

	// hide messages 
	$("#error").hide();
	$("#success").hide();
	
	// on submit...
	$("#contactForm #submit").click(function() {
		$("#error").hide();
		
		
		alert('1');
		//required:
		
		//name
		var name = $("input#name").val();
		if(name == ""){
			$("#error").fadeIn().text("Nome obrigatório.");
			$("input#name").focus();
			return false;
		}
		

		alert('2');
		// email
		var email = $("input#email").val();
		if(email == ""){
			$("#error").fadeIn().text("Email obrigatório.");
			$("input#email").focus();
			return false;
		}
		//birthday
		var birthday = $("input#birthday").val();
		if(birthday == ""){
			$("#error").fadeIn().text("Nascimento obrigatório");
			$("input#birthday").focus();
			return false;
		}
		
		// phone
		var phone = $("input#phone").val();
		if(phone == ""){
			$("#error").fadeIn().text("Telefone obrigatório");
			$("input#phone").focus();
			return false;
		}
		

		alert('3');
		// comments
		var comments = $("#comments").val();
		
		// send mail php
		var sendMailUrl = $("#sendMailUrl").val();
		
		//to, from & subject
		var to = $("#to").val();
		var from = $("#from").val();
		var subject = $("#subject").val();
		
		// data string
		var dataString = 'name='+ name
						+ '&email=' + email        
						+ '&phone=' + phone
						+ '&comments=' + comments
						+ '&to=' + to
						+ '&from=' + from
						+ '&subject=' + subject;			
		
		alert(sendMailUrl);
		alert(dataString);
		
		// ajax
		$.ajax({
			type:"POST",
			url: sendMailUrl,
			data: dataString,
			success: success()
		});
	});  
		
		
	// on success...
	 function success(){
	 	$("#success").fadeIn();
	 	$("#contactForm").fadeOut();
	 }
	
    return false;
});

