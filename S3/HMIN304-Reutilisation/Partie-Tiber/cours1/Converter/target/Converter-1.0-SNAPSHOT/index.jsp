<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Converter</title>
</head>
<body>
<jsp:useBean class="converter.ConverterEjbBean" id="beanConv"/>

<form action="index.jsp" method="GET">
    <input type="hidden" name="convert">

    <label for="amount">Amount</label>
    <input type="number" name="amount" id="amount">

    <label for="target">Currency Type</label>
    <select id="target" name="target">
        <option value="USD">USD</option>
        <option value="JPY">JPY</option>
    </select>

    <input type="submit" value="Submit">
</form>

<%
    String amount = request.getParameter("amount");
    String currencyType = request.getParameter("target");

    if(amount != null && currencyType != null){
        double amount_double = Double.parseDouble(amount);
        double newAmount = beanConv.euroToOtherCurrency(amount_double, currencyType);
        out.println("New amount : " + newAmount);
    }

%>
</body>
</html>
