<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
     uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h2>Signing up an user </h2>
    <form:form modelAttribute="registration">
        <div>
            <form:errors path="*" cssClass="errorblock" element="div"/>

            <spring:message code="name"/> :
            <form:input type="text" path="name"/>

            <spring:message code="email"/> :
            <form:input type="email" path="email"/>

            <form:button type="submit" value="Envoyer" />
        </div>
    </form:form>
</body>
</html>
