function search(){
  	var id = document.getElementById("cid").value;
  	if(isNaN(id)) {
  		alert("Customer ID is not a number");
  	}
  	else {
  		doAjax(id);
  	}
}

function doAjax(id) {
	var ajax = new XMLHttpRequest();
	var url = "http://localhost:8080/Order_Processing_System/viewbyid.htm?cid=" + id;
	ajax.open("GET", url, true);
	ajax.send();
	ajax.onreadystatechange = function(){
		if(ajax.readyState == 4 && ajax.status == 200) {
			var str = ajax.responseText;
			var json = JSON.parse(str);
			
			//alert(ajax.readyState);
			document.getElementById("cust_div").style.display = "block";
			document.getElementById("err").style.display = "none";
			document.getElementById("name").innerHTML = json.cname;
			document.getElementById("address").innerHTML = json.address;
			document.getElementById("state").innerHTML = json.state;
			document.getElementById("gst").innerHTML = json.gstNo;
			document.getElementById("phone").innerHTML = json.phone;
			document.getElementById("email").innerHTML = json.email;
			document.getElementById("pincode").innerHTML = json.pincode;

		}
		else {
			document.getElementById("cust_div").style.display = "none";
			document.getElementById("err").style.display = "block";
			document.getElementById("err").innerHTML = "Customer not found for " + id;
		}
	};
}