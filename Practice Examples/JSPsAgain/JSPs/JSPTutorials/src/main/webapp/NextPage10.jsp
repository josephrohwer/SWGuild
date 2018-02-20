<%-- 
    Document   : NextPage10
    Created on : Oct 14, 2015, 9:07:40 AM
    Author     : mgaffney
--%>

<jsp:useBean id="user" class="com.mycompany.jsptutorials.UserData" scope="session"/> 
<HTML>
    <BODY>
        You entered<BR>
        Name: <%= user.getUsername()%><BR>
        Email: <%= user.getEmail()%><BR>
        Age: <%= user.getAge()%><BR>
    </BODY>
</HTML>
