<%@include file="Meta.jsp" %>
<%@include file="Head.jsp" %>
<script type="text/javascript" src="../Ajax/Ajax_ProductData.js"></script>
<body>
	<%@include file="HeaderSection.jsp" %>
	<div id="nav">
		<ul>
			<li><a href="login.jsp">Log In</a></li>
			<li><a href="#">Employee Log In</a></li>
			<li><a href="CreateQuote.jsp">Contact Us</a></li>
		</ul>
	</div>
	
	<h2>ADD Products</h2>
	<select name="ptype" id="ptype" onchange="searchProducts()">
		<option>Select Product Type</option>
		<option value="1">Type1</option>
		<option value="2">Type2</option>
		<option value="3">Type3</option>
	</select>
	
	
	<div id="prod_div" style="display:none">
		<table id="prod_info_tbl">
			<!-- product list will be added from the database -->
		</table>
	</div>	
		
</body>
</html>