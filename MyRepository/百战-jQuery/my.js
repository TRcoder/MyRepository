

// function test(){
// 	alert("test：外部引入");
// }
//声明对象
// var bjsxt={};
// 
// bjsxt.test=function(){
// 		alert("test：外部引入");
// }
/
//使用工厂模式
(function (obj){
	//var bjsxt={};
	
	bjsxt.test=function(){
			alert("工厂");
	}
	alert("函数自调用");
})(window)
