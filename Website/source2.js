$(document).ready(function(){
	$("#img1").fadeTo(1000,0.5);
	$("#img2").fadeTo(1000,0.5);
	$("div").mouseover(function(){
		$(this).fadeTo(0,1);
		$("p",this).fadeTo(0,1);
		});
	$("div").mouseout(function(){
		$(this).fadeTo(0,0.5);
		$("p",this).fadeTo(0,0);
	});
});