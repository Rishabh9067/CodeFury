<%@include file="Meta.jsp" %>
<%@include file="Head.jsp" %>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>

<script type="text/javascript" src="../Ajax/Ajax_customerData.js"></script>
<link rel="stylesheet" href="../Css/quote.css">

<body>
	<%@include file="HeaderSection.jsp" %>
	<div id="nav">
		<ul>
			<li><a href="Home.jsp">Home</a></li>
			<li><a href="Home.jsp">Logout</a></li>	
		</ul>
	</div>
	<div id="err"></div>
	<div id="id_div">
	   Customer ID: <input type="text" id="cid"/>
	   <input type="button" value="search" onclick="search()"/>
	</div>
	<div id="cust_div" style="display:none">
		<table id="cust_info_tbl">
		    <tr>
				<th width="150" height="70">Name</th>
				<td width="400" id="name" name="name"></td>
			</tr>
			<tr>
				<th width="150" height="70">GST No</th>
				<td width="400" id="gst" name="gst"></td>
			</tr>
			<tr>
				<th width="150" height="70">Shipping Address</th>
				<td width="400" id="address" name="address"></td>
			</tr>
			<tr>
				<th width="150" height="70">State</th>
				<td width="400" id="state" name="state"></td>
			</tr>
			<tr>
				<th width="150" height="70">Phone No</th>
				<td width="400" id="phone" name="phone"></td>
			</tr>	<tr>
				<th width="150" height="70">Email</th>
				<td width="400" id="email" name="email"></td>
			</tr>	
			<tr>
				<th width="150" height="70">Pincode</th>
				<td width="400" id="pincode" name="pincode"></td>
			</tr>	
			<tr>
				<th width="150" height="70">Date</th>
				<td width="400" id="date" name="date"><input type="date" min="date"></td>
			</tr>
		</table>
		<button id="add_btn"><a href="AddProduct.jsp">Add Product</a></button>
	</div>	
</body>
</html>