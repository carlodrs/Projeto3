
function submit(){
	$("#UserAction").submit();
}

function clearPage(){
	$("#UserAction")[0].reset();
}

function readUser(){
	$("#UserAction").attr('action', 'readUser');
	$("#UserAction").submit();
}

function prepareUpdate(){
	$("#UserAction").attr('action', 'prepareUpdate');
	$("#UserAction").submit();
}


$(function() {
  $('.date').mask('00/00/0000');
  $('.cep').mask('00000-000');
  $('.phone_with_ddd').mask('(00) 0000-0000');
  $('.placeholder').mask("00/00/0000", {placeholder: "__/__/____"});
  $('.fallback').mask("00r00r0000", {
    translation: {
      'r': {
        pattern: /[\/]/, 
        fallback: '/'
      }, 
      placeholder: "__/__/____"
    }
  });

  $('.cpf').mask('000.000.000-00', {reverse: true});
  $('.rg').mask('00.000.000-0', {reverse: true});

  var SPMaskBehavior = function (val) {
    return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
  },
  spOptions = {
    onKeyPress: function(val, e, field, options) {
        field.mask(SPMaskBehavior.apply({}, arguments), options);
      }
  };

  $('.sp_celphones').mask(SPMaskBehavior, spOptions);

});


