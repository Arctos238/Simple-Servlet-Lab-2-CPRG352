<%-- 
    Document   : agecalculator
    Created on : Sep. 12, 2022, 12:31:23 p.m.
    Author     : Jacque Pointer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST">
            <label>Enter your age: </label>
            <input type="number" id="age" name="age" value=""/>
            <div>
            <button type="submit">Age Next Birthday</button>
            </div>
        </form>
        <div>
        <% if(request.getAttribute("age") != null) {
           %> <%=request.getAttribute("age")%>
           <% } %>
           
          <% if(request.getAttribute("message") != null) {
             %> <%=request.getAttribute("message")%> 
             <% } %>
        </div>
         <a href="./arithmetic">Arithmetic Calculator</a>    
    </body>
</html>
