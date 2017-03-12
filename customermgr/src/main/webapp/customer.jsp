<html>
<body>
<h2>Hello World! customermgr</h2>
<%@page import="com.nxs.architecture.customermgr.Customer" %>
<%
    System.out.println("now in Customer customer.jsp");
    new Customer().customer();
%>
</body>
</html>
