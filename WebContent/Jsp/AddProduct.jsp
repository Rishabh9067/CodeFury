<%@include file="Meta.jsp" %>
<%@include file="Head.jsp" %>
<script type="text/javascript" src="../Ajax/Ajax_ProductData.js"></script>
<link rel="stylesheet" href="../Css/add_prod.css">
<body>
	<%@include file="HeaderSection.jsp" %>
	<div id="nav">
		<ul>
			<li><a href="login.jsp">Log In</a></li>
			<li><a href="#">Employee Log In</a></li>
			<li><a href="CreateQuote.jsp">Contact Us</a></li>
		</ul>
	</div>
	<div id="err" style="display:none"></div>
	<div id="product_type">
		<h3>Add Products</h3>
		<select name="ptype" id="ptype_drop" onchange="searchProducts()">
			<option>Select Product Type</option>
			<option value="1">Type1</option>
			<option value="2">Type2</option>
			<option value="3">Type3</option>
		</select>
	</div>
	<div id="prod_div" style="display:block">
		<ul id="prod_info_ul">
		</ul>
	</div>
	<div id="summary_div">
		<h3>Selected Products</h3>
		<ul id="selected_prod_ul">
			
		</ul>
	</div>
</body>
</html>