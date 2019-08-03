<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>main</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div>main.jsp</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		console.log("main.jsp ready...");
		
		console.log('ajax test...');
		$.ajax({
			url : 'ASTopo/getInitTopo',  
	        type : 'get', 
	        //data: {'as_num': 9},
	        //contentType : 'application/json;charset=utf-8',//注意类型	        
	        dataType: 'json',
			//jsonp: "callbackparam", //服务端用于接收callback调用的function名的参数  
			//jsonpCallback: "success_jsonpCallback",
	        success : function(data) {
	        	console.log(data);
	            console.log("hahahah");  
	        },  
	        error : function() {  
	        	console.log("wuwuwuwu");  
	        }
	      });
	});
</script>
</html>