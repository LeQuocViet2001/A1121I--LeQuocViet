<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>

    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />
    <%--    <link rel="stylesheet" href="/css/homeWeb.css">--%>
    <link rel="stylesheet" type="text/css" href="css/homeWeb.css" >
    <link rel="stylesheet" type="text/css" href="css/sidebar.css" >

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>

    <%--    <link rel="stylesheet" href="/css/sidebar.css">--%>

    <style>
        .content{
            width: 100vw;
            height: 85vh;
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


<body>
<%@ include file="/view/teamplate.jsp"%>

<div class="row content" style="    margin-right: 0px; margin-left: 0px;">
    <div class="row content container-fluid ">
        <div class="col-lg-1 left">
            <div class="vertical-menu">

                <a class="dropdown-item" href="/employee?action=add">New Employee</a>
            </div>
        </div>
        <div class="col-lg-11 tableContent "  style=" display: block;  overflow: auto; ">
            <%--  table list--%>
            <table id="tablePhanTrang" class="  table table-striped table-bordered table-responsive "   >
                <thead class="thead-dark">
                <tr>
                    <th scope="col">stt</th>
                    <th scope="col">id</th>
                    <th scope="col">name</th>
                    <th scope="col">birthday</th>
                    <th scope="col"> card </th>
                    <th scope="col"> salary </th>
                    <th scope="col"> phone </th>
                    <th scope="col"> email </th>
                    <th scope="col"> address </th>
                    <th scope="col"> position_id </th>
                    <th scope="col"> educationid </th>
                    <th scope="col"> division_id </th>
                    <th scope="col"> Sua </th>
                    <th scope="col"> Xoa </th>
                </tr>
                </thead>
                <tbody>
                <c:if test="${employeeList != null}" >
                    <c:forEach items="${employeeList}" var="emp" varStatus="i">
                        <tr>
                            <td scope="row"> ${ i.count}    </td>
                            <td > ${   emp.getEmployee_id() }    </td>
                            <td > ${   emp.getEmployee_name() }    </td>
                            <td > ${   emp.getEmployee_birthday() }    </td>
                            <td > ${   emp.getEmployee_id_card() }    </td>
                            <td > ${   emp.getEmployee_salary() }    </td>
                            <td > ${   emp.getEmployee_phone() }    </td>
                            <td > ${   emp.getEmployee_email() }    </td>
                            <td > ${   emp.getEmployee_address() }    </td>

                            <td >
                            <c:forEach items="${positionList}" var="position"  varStatus="i">
                                <c:if test="${  position.getPosition_id() == emp.getPosition_id()   }">
                                    ${  position.getPosition_name() }
                                </c:if>
                            </c:forEach>
                            </td>

                            <c:forEach items="${educationDegreeList}" var="educationDegree"  varStatus="i">
                                <c:if test="${ educationDegree.getEducationDegreeId() ==  emp.getEducation_degree_id()}">
                                  <td>  ${   educationDegree.getEducationDegreeName() }    </td>                                </c:if>
                            </c:forEach>

                            <c:forEach items="${divisionList}" var="division"  varStatus="i">
                                <c:if test="${ division.getDivisionId() ==   emp.getDivision_id()  }">
                                    <td > ${   division.getDivisionName() }    </td>
                                </c:if>

                            </c:forEach>
<%--                            <td > ${   emp.getPosition_id() }    </td>--%>
<%--                            <td > ${   emp.getEducation_degree_id() }    </td>--%>
<%--                            <td > ${   emp.getDivision_id() }    </td>--%>
                            <td>
                                    <a href="/employee?action=edit&id=${ emp.getEmployee_id()}"><button    class="btn btn-outline-info" >
                                        Edit
                                    </button></a>
                            </td>
                            <td>
                                <button type="button" id="btnDel" onclick=" showModelDelete('${emp.getEmployee_id() }','${emp.getEmployee_name()}'); "
                                        class="btn btn-outline-danger" data-toggle="modal"  data-target="#modalDelete">
                                    Delete
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
                </tbody>
            </table>
            <script src="datatables/js/jquery.dataTables.min.js"></script>
            <script src="datatables/js/dataTables.bootstrap4.min.js"></script>
            <script>
                $(document).ready(function() {
                    $('#tablePhanTrang').dataTable( {
                        "dom": 'lrtip',
                        "lengthChange": false,
                        "pageLength": 5
                    } );
                } );
            </script>




        </div>
    </div>
</div>



</body>
</html>
