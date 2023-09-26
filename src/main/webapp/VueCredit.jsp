<%@ page import="model.CreditModel" %>
<jsp:useBean id="creditModel" scope="session" class="model.CreditModel"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Credit bank</title>
</head>
<body>
<h1>Fill out application : </h1>
<form action="doing.do" method="post">

    <div >
        <div class="container">
            Amount :<input type="text" placeholder="Enter your amount" name="amount" value="${creditModel.amount}" >DH<br>
            Duration:<input type="text" placeholder="Enter your duration" name="duration" value="${creditModel.duration}" >Month<br>
            Rate    :<input type="text" placeholder="Enter rate" name="rate" value="${creditModel.rate}">%<br>
        </div>
        <input type="submit" value="Calculer">

    </div>
</form>
<p></p>
<div>
    <p>Payment Monthly : ${creditModel.paymentMonthly} </p>
</div>
<div>
   
</div>
</body>
</html>
