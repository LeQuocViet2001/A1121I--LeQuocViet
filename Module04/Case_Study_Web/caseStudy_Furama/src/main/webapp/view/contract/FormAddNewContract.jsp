<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Them moi Hop Dong</title>
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
    <link rel="stylesheet" type="text/css" href="css/homeWeb.css">
    <link rel="stylesheet" type="text/css" href="css/sidebar.css">
    <%--    <link rel="stylesheet" href="/css/sidebar.css">--%>

    <style>
        .content {
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

        .tableContent {
            margin-right: 0px;
            margin-left: 0px;
            padding-left: 0px;
            padding-right: 0px;
        }

    </style>
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Create
    Contract</h1>
<form method="post" action="/contract?action=add" style="margin-left: 150px; margin-right: 150px">

    <input name="service_type_id" hidden type="text" value="1">
    <div class="mb-4">

    </div>

    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label>contract_start_date</label>
            <input name="contract_start_date" type="date" class="form-control" placeholder="dd-mm-yyyy" min="1997-01-01"
                   max="2030-12-31" required>
        </div>

        <div class="col-md-6 mb-4">
            <label>contract_end_date</label>
            <input name="contract_end_date" type="date" class="form-control" placeholder="dd-mm-yyyy" min="1997-01-01"
                   max="2030-12-31" required>
        </div>

    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label>contract_deposit</label>
            <input name="contract_deposit" type="number" class="form-control" value="" required
                   placeholder="contract_deposit">
        </div>

        <div class="col-md-6 mb-4">
            <label>contract_total_money</label>
            <input name="contract_total_money" type="number" class="form-control" value="" required
                   placeholder="contract_total_money">
        </div>


    </div>


    <%--////////////////////--%>
    <div class="form-row">

        <div class="col-md-4 mb-4">
            <label>employee</label>
            <select name="employee_id" class="form-control">
                <c:forEach items="${employeeList}" var="employee" varStatus="i">
                    <option value="${employee.getEmployee_id()}">${employee.getEmployee_name()} </option>
                </c:forEach>
            </select>
        </div>

        <div class="col-md-4 mb-4">
            <label>serviceList</label>
            <select name="service_id" class="form-control">
                <c:forEach items="${serviceList}" var="s" varStatus="i">
                    <option value="${s.getService_id()}">${s.getService_name()} </option>
                </c:forEach>
            </select>
        </div>

        <div class="col-md-4 mb-4">
            <label>customerList</label>
            <select name="customer_id" class="form-control">
                <c:forEach items="${customerList}" var="c" varStatus="i">
                    <option value="${c.getCustomer_id()}">${c.getCustomer_name()} </option>
                </c:forEach>
            </select>
        </div>


    </div>


    <button class="btn btn-primary" type="submit">Submit</button>
    <button class="btn btn-primary" onclick="window.history.back();">Cancel</button>

</form>
</body>
</html>