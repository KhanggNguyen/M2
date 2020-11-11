<%@ page import="converter.Monnaie" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.jms.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Converter</title>
</head>
<body>
<jsp:useBean class="converter.ConverterEjbBean" scope="session" id="beanConv"/>

<form action="index.jsp" method="GET">
    <input type="hidden" name="convert">

    <label for="amount">Amount : </label>
    <input type="number" name="amount" id="amount">

    <label for="target">Currency Type : </label>
    <select id="target" name="target">
        <% for(Monnaie monnaie : beanConv.getAvailableCurrencies()){ %>
               <option value="<%= monnaie.code %>"> <%= monnaie.code %> </option>
        <% } %>

    </select>

    <label for="email">Email : </label>
    <input type="email" name="email" id="email">

    <input type="submit" value="Submit">
</form>

<%
    String currencyType = request.getParameter("target");
    String amount = request.getParameter("amount");

    if(amount != null && amount.length() != 0 /* &&  currencyType != null */){
        double amount_double = Double.parseDouble(amount);
        double newAmount = beanConv.euroToOtherCurrency(amount_double, currencyType);
        out.println("Vérifier votre boite mail !");

        String email = request.getParameter("email");
        if(email != null && email.length() != 0){


            Context jndiContext = new InitialContext();
            javax.jms.ConnectionFactory connectionFactory = (QueueConnectionFactory)jndiContext.lookup("/ConnectionFactory");
            Connection connection = connectionFactory.createConnection();
            Session sessionQ = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            TextMessage message = sessionQ.createTextMessage();
            message.setText(amount+"#"+email);

            javax.jms.Queue queue = (javax.jms.Queue) jndiContext.lookup("queue/MailContent");
            MessageProducer messageProducer = sessionQ.createProducer(queue);
            messageProducer.send(message);
        }

    }



%>
</body>
</html>
