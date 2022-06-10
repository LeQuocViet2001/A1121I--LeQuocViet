<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sua</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <%--    <link rel="stylesheet" href="/css/homeWeb.css">--%>
    <link rel="stylesheet" type="text/css" href="css/homeWeb.css" >
    <link rel="stylesheet" type="text/css" href="css/sidebar.css" >
    <%--    <link rel="stylesheet" href="/css/sidebar.css">--%>

    <style>
        .content{
            width: 100vw;
            height: 75vh;
            border-radius: 1px;
            margin-left: 0px;
            margin-right: 0px;
            padding-left: 0px;
            padding-right: 0px;

        }

        .left {
            margin-right: 0px;
            margin-left: 0px;
            padding-left: 0px;
            padding-right: 0px;

        }

        .tableContent{
            margin-right: 0px;
            margin-left: 0px;
            padding-left: 0px;
            padding-right: 0px;
        }

    </style>
</head>
<body >
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Edit Customer</h1>
<form method="post" action="/customer?action=add" style="margin-left: 150px; margin-right: 150px">
    <div class="mb-4">
        <label for="id">Customer Id</label>
        <input name="customer_id" type="text" class="form-control" id="id"  value="${customer.getCustomer_id() }" required placeholder="Enter your name...">
    </div>
    <div class="mb-4">
        <label for="name">Customer Name</label>
        <input name="customer_name" type="text" class="form-control" id="name" value="${customer.getCustomer_id() }" required placeholder="Enter your name...">
    </div>
    <div class="form-row">

        <div class="col-md-6 mb-4">
            <label for="select">Gender</label>
            <select class="custom-select" id="select" name="customer_gender" required>
                <option selected value="true">Male</option>

                <c:if test="${customer.isCustomer_gender() == false}">  <option value="false" selected >Female</option>   </c:if>
                <c:if test="${customer.isCustomer_gender() == true}">  <option value="false"  >Female</option>   </c:if>

                <option value="false">Woman</option>
            </select>
        </div>
        <div class="col-md-6 mb-4">
            <label >Birthday</label>
            <input name="customer_birthday" id="customer_birthday" type="date" class="form-control"   placeholder="dd-mm-yyyy" value="${customer.getCustomer_birthday()}" min="1997-01-01" max="2030-12-31" required>


        </div>
    </div>
    <div class="form-row">
        <div class="col-md-4 mb-4">
            <label for="customer_id_card">ID Card</label>
            <input name="customer_id_card" type="text" class="form-control" id="customer_id_card" value="${customer.getCustomer_id_card() }" required placeholder="Enter your ID card...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="phone">Phone Number</label>
            <input name="customer_phone" type="text" class="form-control" id="phone" value="${customer.getCustomer_phone() }" required placeholder="Enter your phone number...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="mail">Email address</label>
            <input name="customer_email" type="text" class="form-control" id="mail" value="${customer.getCustomer_email() }" required placeholder="Enter your email...">
        </div>
    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label for="adress">Address</label>
            <input name="customer_address" type="text" class="form-control" id="adress" value="${customer.getCustomer_address() }" required placeholder="Enter your address...">
        </div>
        <div class="col-md-6 mb-4">
            <label for="customer_type_id">Type Customer</label>
            <select name="customer_type_id" id="customer_type_id" class="form-control">
                <c:forEach items="${customerTypeList}" var="customerType"  varStatus="i">
                    <c:if test="${ customer.getCustomer_type_id()  ==  customerType.getCustomerTypeId()}">
                        <option  selected value="${customerType.getCustomerTypeId()}">  ${customerType.getCustomerTypeName()} </option>
                    </c:if>
                    <c:if test="${ customer.getCustomer_type_id()  !=  customerType.getCustomerTypeId()}">
                        <option   value="${customerType.getCustomerTypeId()}">  ${customerType.getCustomerTypeName()} </option>
                    </c:if>


                </c:forEach>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
            <label class="form-check-label" for="invalidCheck2">
                Agree to terms and conditions
            </label>
        </div>
    </div>
    <button class="btn btn-primary" type="submit">Submit</button>
    <button class="btn btn-primary" onclick="window.history.back();">Cancel</button>

</form>
</body>
</html>
