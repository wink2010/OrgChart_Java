$(document).ready(function()
{
	
	

	$('#addBtn-container').css('width', $('#t1').width());

	$('#addBtn').click(function() {
		
	/*	$('#addBtn-container').fadeToggle("fast", "linear", function() {
			
		});
	*/	
		
		$('#addEntity').fadeToggle("fast", "linear");
	
	});
	
	
	
	
	$('.cancelButton').click(function(){
		
		var x=$(this).parent().parent();
		
		//alert(x);
		$(x).css("display", "none");
				
				//.fadeToggle("fast", "linear"));
		
		//$('#updateEntity').fadeToggle("fast", "linear");
		
		$('.input').val(null);
		//$('#updateOldName').val(null);
		//$('#updateName').val(null);
		
	});
	
	
});