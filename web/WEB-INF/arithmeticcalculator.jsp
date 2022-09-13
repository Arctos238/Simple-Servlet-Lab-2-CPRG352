<%-- 
    Document   : arithmeticcalculator
    Created on : 12-Sep-2022, 8:35:20 PM
    Author     : Jacque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="GET"> 
            <div>
                <label>First:</label>
                <input type="number" name="first_number" id="first_number" value="<%=request.getAttribute("first_number")%>"/>
            </div>
            <div>
                <label>Second:</label>
                <input type="number" name="second_number" id="second_number" value="<%=request.getAttribute("second_number")%>"/>
            </div>
            <div>
                <input type="submit" id="button" name="button" value="+"></input>
                <input type="submit" id="button" name="button" value="-"></input>
                <input type="submit" id="button" name="button" value="*"></input>
                <input type="submit" id="button" name="button" value="%"></input>
            </div>
        </form>
        <br/>
        <div>
            <label name="result" id="result">Result: 
                <% if (request.getAttribute("result") == null) {%>
                --- <% } else {
                %> <%=request.getAttribute("result")%> 
                <% }%>
            </label>
        </div>
        <a href="./age">Age Calculator</a>


    </section>
</body>
</html>
