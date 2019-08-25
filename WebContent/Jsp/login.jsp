<%@include file="Meta.jsp" %>
<%@include file="Head.jsp" %>

<!-- Add new css files here. Don't add in the Head.jsp file -->
<link rel="stylesheet" href="../Css/login.css">

<body>
	<%@include file="HeaderSection.jsp" %>
	<div id="nav">
		<ul>
			<li><a href="Home.jsp">Home</a></li>
		</ul>
	</div>
	<div id="login_div">
		<table id="login_table">
			<tr>
				<td>
					<input type="text" name="email" id="email" placeholder="Email-ID">
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="pwd" id="pwd" placeholder="Password">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="submit" value="Sign in" id="submit_btn">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>