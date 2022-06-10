<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Them moi Service</title>
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
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Create Service</h1>
<form method="post" action="/service?action=add" style="margin-left: 150px; margin-right: 150px">

    <input name="service_type_id" hidden type="text"  value="2">
    <div class="mb-4">
        <label >service_name</label>
        <input name="service_name" type="text" class="form-control"  value="" required placeholder="Enter your name...">
    </div>

    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >service_area</label>
            <input name="service_area" id="employee_salary" type="number"  class="form-control" placeholder="service_area"    required>
        </div>

        <div class="col-md-6 mb-4">
            <label >service_cost</label>
            <input name="service_cost"  type="number"  class="form-control" placeholder="service_area"    required>
        </div>

    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >service_max_people</label>
            <input name="service_max_people" type="number" class="form-control" value="0" required placeholder="service_max_people">
        </div>

        <div class="col-md-6 mb-4">
            <label >education_degree_id</label>
            <select name="rent_type_id" class="form-control">
                <c:forEach items="${rent_typeList}" var="rent_type"  varStatus="i">
                    <option value="${rent_type.getRent_type_id()}">${rent_type.getRent_type_id_name()} </option>
                </c:forEach>
            </select>
        </div>

    </div>


    <%--////////////////////--%>
    <div class="form-row" >
        <div class="col-md-6 mb-4">
            <label >standard_room</label>
            <input name="standard_room" type="number" class="form-control"  value="0" required placeholder="standard_room">
        </div>
        <div class="col-md-6 mb-4">
            <label >number_of_floors</label>
            <input name="number_of_floors" type="number" class="form-control"  value="0" required placeholder="number_of_floors">
        </div>
    </div>

    <div class="form-row" hidden>
        <div class="col-md-6 mb-4">
            <label >pool_area</label>
            <input name="pool_area" type="number"  class="form-control"  value="0"  placeholder="pool_area">
        </div>
        <div class="col-md-6 mb-4">
            <label >description_other_convenience</label>
            <input name="description_other_convenience" type="text" class="form-control"  value=""   placeholder="description_other_convenience">
        </div>
    </div>



    <button class="btn btn-primary" type="submit">Submit</button>
    <button class="btn btn-primary" onclick="window.history.back();">Cancel</button>

</form>
</body>
</html>
