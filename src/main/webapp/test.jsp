<%@ page import="model.CreditModel" %>
<%CreditModel model = (CreditModel) request.getAttribute("creditModel");
%>
<html>
<head>
    <title>Credit bank</title>
</head>
<body>
<h1>Fill out application : </h1>
<form action="doing.do" method="post">

    <div >
        <div class="container">
            Amount :<input type="text" placeholder="Enter your amount" name="amount" value="<%= model.getAmount() %>" >DH<br>
            Duration:<input type="text" placeholder="Enter your duration" name="duration" value="<%= model.getDuration() %>" >Month<br>
            Rate    :<input type="text" placeholder="Enter rate" name="rate" value="<%= model.getRate() %>">%<br>
        </div>
        <input type="submit" value="Calculer">
    </div>
</form>
<p></p>
<div>
    <p>Payment Monthly : <%= model.getPaymentMonthly() %></p>
</div>
</body>
</html>
