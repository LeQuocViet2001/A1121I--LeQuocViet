<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Them moi Employee</title>
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
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Edit
    Employee</h1>
<form method="post" action="/employee?action=edit  " style="margin-left: 150px; margin-right: 150px">

    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label> Empoyee ID</label>
            <input name="employee_id" readonly type="text" class="form-control" value="${ e.getEmployee_id() }" required
                   placeholder="Enter your name...">
        </div>

        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Empoyee Name</label>
            <input name="employee_name" type="text" class="form-control" id="validationDefault01"
                   value="${ e.getEmployee_name() }" required placeholder="Enter your name...">
        </div>

    </div>
    <div class="form-row">

        <div class="col-md-6 mb-4">
            <label>Salary</label>
            <input name="employee_salary" id="employee_salary" type="number" class="form-control"
                   placeholder="employee_salary" value="${ e.getEmployee_salary() }" required>
        </div>

        <div class="col-md-6 mb-4">
            <label>Birthday</label>
            <input name="employee_birthday" id="employee_birthday" type="date" class="form-control"
                   value="${ e.getEmployee_birthday() }" placeholder="dd-mm-yyyy" min="1997-01-01" max="2030-12-31"
                   required>

        </div>

    </div>
    <div class="form-row">
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">ID Card</label>
            <input name="employee_id_card" type="text" class="form-control" id="validationDefault04"
                   value="${ e.getEmployee_name() }" required placeholder="Enter your ID card...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">Phone Number</label>
            <input name="employee_phone" type="text" class="form-control" id="validationDefault06"
                   value="${ e.getEmployee_id_card() }" required placeholder="Enter your phone number...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">Email address</label>
            <input name="employee_email" type="text" class="form-control" id="validationDefault07"
                   value="${ e.getEmployee_email() }" required placeholder="Enter your email...">
        </div>
    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Address</label>
            <input name="employee_address" type="text" class="form-control" id="validationDefault08"
                   value="${ e.getEmployee_address() }" required placeholder="Enter your address...">
        </div>
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">position_id</label>
            <select name="position_id" class="form-control">
                <c:forEach items="${positionList}" var="position" varStatus="i">
                    <c:if test="${  position.getPosition_id() == e.getPosition_id()  }">
                        <option selected value="${position.getPosition_id()}">${position.getPosition_name()} </option>
                    </c:if>
                    <c:if test="${  position.getPosition_id() != e.getPosition_id()  }">
                        <option value="${position.getPosition_id()}">${position.getPosition_name()} </option>
                    </c:if>
                </c:forEach>
            </select>
        </div>
    </div>


    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">education_degree_id</label>
            <select name="education_degree_id" class="form-control">
                <c:forEach items="${educationDegreeList}" var="educationDegree" varStatus="i">
                    <c:if test="${ educationDegree.getEducationDegreeId() == e.getEducation_degree_id()}">
                        <option selected
                                value="${educationDegree.getEducationDegreeId()}">${educationDegree.getEducationDegreeName()} </option>
                    </c:if>
                    <c:if test="${ educationDegree.getEducationDegreeId() != e.getEducation_degree_id()}">
                        <option value="${educationDegree.getEducationDegreeId()}">${educationDegree.getEducationDegreeName()} </option>
                    </c:if>
                </c:forEach>
            </select>
        </div>
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">division_id</label>
            <select name="division_id" class="form-control">
                <c:forEach items="${divisionList}" var="division" varStatus="i">
                    <c:if test="${ division.getDivisionId() ==  e.getDivision_id()   }">
                        <option selected value="${division.getDivisionId()}">${division.getDivisionName()} </option>
                    </c:if>

                    <c:if test="${ division.getDivisionId() !=  e.getDivision_id()   }">
                        <option value="${division.getDivisionId()}">${division.getDivisionName()} </option>
                    </c:if>
                </c:forEach>
            </select>
        </div>
    </div>

    <button class="btn btn-primary" type="submit">Submit</button>
    <button class="btn btn-primary" onclick="window.history.back();">Cancel</button>

</form>
</body>
</html>
