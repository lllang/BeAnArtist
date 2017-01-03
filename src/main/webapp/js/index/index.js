$('#loginBtn').click(function(event) {
	event.preventDefault();
	$('form').fadeOut(500);
	$('.wrapper').addClass('form-success');
	var userName = $('#userName').attr('value') || '' ? $('#userName').attr('value') : 'illegal';
	var userPassword = $('#userPassowrd').attr('value') || '' ? $('#userPassowrd').attr('value') : 'illegal';
	$.ajax({
		'url' : '/userlogin/' + userName + '/' + userPassword,
		'type' : 'get',
		'dataType' : 'json',
		'async' : false,
		'success' : function(data) {
			if(data.isSuccess == 0){
				window.location.href = '/beAnArtist/showAll.jsp';
			}
		},
		'error' : function() {
			window.location.href = '/index.jsp';
		}
	})
});