<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>


    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />

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
            height: 85vh;
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

<body>
<%@ include file="/view/teamplate.jsp"%>

<div class="row content" style="    margin-right: 0px; margin-left: 0px;">
    <div class="row content container-fluid ">
        <div class="col-lg-1 left">
            <div class="vertical-menu">

                <a class="dropdown-item" href="/contract?action=add">New Contract</a>
            </div>
        </div>
        <div class="col-lg-11 tableContent "  style=" display: block;  overflow: auto; ">
            <%--  table list--%>
            <table id="tablePhanTrang"  class="  table table-striped table-bordered    "  >
                <thead class="thead-dark">
                <tr>
                    <th scope="col">stt</th>
                    <th scope="col">contract_id</th>
                    <th scope="col">start_date</th>
                    <th scope="col">end_date</th>
                    <th scope="col">deposit</th>
                    <th scope="col">total_money </th>
                    <th scope="col"> employee_id </th>
                    <th scope="col"> customer_id </th>
                    <th scope="col"> service_id </th>
                    <th scope="col"> Them Chi Tiet </th>

                </tr>
                </thead>
                <tbody>
                <c:if test="${contractList != null}" >
                    <c:forEach items="${contractList}" var="c" varStatus="i">
                        <tr>
                            <td scope="row"> ${ i.count}    </td>
                            <td > ${   c.getContract_id() }    </td>
                            <td > ${   c.getContract_start_date() }    </td>
                            <td > ${   c.getContract_end_date() }    </td>
                            <td > ${   c.getContract_deposit() }    </td>
                            <td > ${   c.getContract_total_money() }    </td>
                            <td > ${   c.getEmployee_id() }    </td>
                            <td > ${   c.getCustomer_id() }    </td>
                            <td > ${   c.getService_id() }    </td>

                            <td>
                                <a href="/contract?action=addDetail&id=${  c.getContract_id() }"><button    class="btn btn-outline-info" >
                                    Add Detail
                                </button></a>
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
