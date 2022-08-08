<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hop dong chi tiet</title>
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
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Chi tiet hop
    dong</h1>
<form method="post" action="/contract?action=addDetail" style="margin-left: 150px; margin-right: 150px">

    <label>Id contract</label>
    <input name="contract_id" type="text" readonly value="${contract_id}">

    <div class="form-row">

        <div class="col-md-6 mb-4">
            <label>quantity</label>
            <input name="quantity" type="text" class="form-control" value="" required placeholder="quantity">
        </div>

        <div class="col-md-4 mb-4">
            <label>attach_service_id</label>
            <select name="attach_service_id" class="form-control">
                <c:forEach items="${attachServiceList}" var="a" varStatus="i">
                    <option value="${a.getAttach_service_id()}">${a.getAttach_service_name()} </option>
                </c:forEach>
            </select>
        </div>


    </div>

    <button class="btn btn-primary" type="submit">Submit</button>
    <button class="btn btn-primary" onclick="window.history.back();">Cancel</button>

</form>
<div class="form-row">
    <div class="row col-lg-12 container">
        <table class="  table table-striped table-bordered   " style="border-radius: 5%">
            <thead class="thead-dark">
            <tr>

                <th scope="col">type_id</th>
                <th scope="col">name</th>
                <th scope="col">status</th>
                <th scope="col"> attach_service_cost</th>
                <th scope="col"> attach_service_unit</th>

            </tr>
            </thead>
            <tbody>

            <c:if test="${attachServiceList != null}">
                <c:forEach items="${attachServiceList}" var="a" varStatus="i">
                    <tr>
                        <td> ${   a.getAttach_service_id() } </td>
                        <td> ${   a.getAttach_service_name() } </td>
                        <td> ${   a.getAttach_service_status() } </td>
                        <td> ${   a.getAttach_service_cost() } </td>
                        <td> ${   a.getAttach_service_unit() } </td>

                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
