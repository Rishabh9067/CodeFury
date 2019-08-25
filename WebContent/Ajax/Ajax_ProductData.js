function searchProducts(){
  	var type = document.getElementById("ptype_drop").value;
  	if(isNaN(type)) {
  		alert("Product Type is not a number");
  	}
  	else {
  		doAjax(type);
  	}
}

function doAjax(type) {
	var ajax = new XMLHttpRequest();
	var url = "http://localhost:8080/Order_Processing_System/viewproductbytype.htm?ptype=" + type;
	ajax.open("GET", url, true);
	ajax.send();
	ajax.onreadystatechange = function(){
		if(ajax.readyState == 4 && ajax.status == 200) {
			var str = ajax.responseText;
			var json = JSON.parse(str);
			document.getElementById("prod_div").style.display = "block";
			document.getElementById("err").style.display = "none";
			var ul = document.getElementById("prod_info_ul");
			ul.innerHTML = '';
			var rows = Object.keys(json).length;
			var data="";
			for(var i=0;i<rows;i++) {
				var count=0;
				var li = document.createElement("li");
				data += "<div id='prod_list'><p><b>Product Name : </b>" + json[i].pname + "</p>";
				data += "<p><b>Product Type : </b>" + "Level " + json[i].categoryId + "</p>";
				data += "<input type='hidden' value='"+ json[i].pid +"'>";
				data += "<p><b>Price : </b>" + json[i].price + "</p>";
				data += "<button onclick='add_count("+ json[i].pid +")'>+</button> <input type='text' id='count_"+ json[i].pid +"' value='"+ count +"'> <button onclick='subtract_count("+ json[i].pid +")'>-</button></div>"
				li.innerHTML = data;
			}
			ul.appendChild(li);
		}
		else {
			document.getElementById("prod_div").style.display = "none";
			document.getElementById("err").style.display = "block";
			document.getElementById("err").innerHTML = "Products not found for level " + type;
		}
	};
}

function add_count(pid) {
	var count = document.getElementById("count_"+pid).value;
	if(count==5) {
		alert("Cannot select any product more than 5 times");
		return;
	}
	document.getElementById("count_"+pid).value = ++count;
}

function subtract_count(pid) {
	var count = document.getElementById("count_"+pid).value;
	if(count==0) {
		return;
	}
	document.getElementById("count_"+pid).value = --count;
} 
