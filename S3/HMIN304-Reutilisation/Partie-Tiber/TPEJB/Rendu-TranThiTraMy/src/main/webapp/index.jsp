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

    <label for="montantId">Montant : </label>
    <input type="number" name="montant" id="montantId">

    <label for="email">Email : </label>
    <input type="email" name="email" id="email">

    <%--
    <label for="typeId">Currency Type : </label>
    <select name="type" id="typeId">
        <% for(Monnaie monnaie : beanConv.getAvailableCurrencies()){ %>
               <option value="<%= monnaie.code %>"> <%= monnaie.code %> </option>
        <% } %>

    </select>
    --%>

    <input type="submit" value="Submit">
</form>

<%
    // String currencyType = request.getParameter("type");
    String montant = request.getParameter("montant");

    if(montant != null && montant.length() != 0 /* &&  currencyType != null */){
        //La conversion est envoyé par mail
        //double montantDouble = Double.parseDouble(amount);
        //double nouveauMontant = beanConv.euroToOtherCurrency(montantDouble, currencyType);

        String email = request.getParameter("email");
        if(email != null && email.length() != 0){

            Context jndiContext = new InitialContext();
            javax.jms.ConnectionFactory connectionFactory = (QueueConnectionFactory)jndiContext.lookup("/ConnectionFactory");
            Connection connection = connectionFactory.createConnection();
            Session sessionQ = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            TextMessage message = sessionQ.createTextMessage();
            message.setText(montant+"#"+email);

            javax.jms.Queue queue = (javax.jms.Queue) jndiContext.lookup("queue/MailContent");
            MessageProducer messageProducer = sessionQ.createProducer(queue);
            messageProducer.send(message);

            out.println("Mail envoyé!");
        }
    }
%>
</body>
</html>
