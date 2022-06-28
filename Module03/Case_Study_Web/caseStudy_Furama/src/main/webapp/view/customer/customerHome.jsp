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

                        <a class="dropdown-item" href="/customer?action=add">New Customer</a>
                    </div>
                </div>

                <div class="col-lg-11 tableContent "  style=" display: block;  overflow: auto; ">

                    <div class="row col-lg-12 ">
                        <form action="/customer?action=search" method="post">
                        <label>Ten:</label> <input type="text"  name="searchName"  width="200px">

                        <label>ngay sinh:</label> <input  name="searchBirtday ">

                        <label> Loai Khach Hang</label>
                            <select name="searchType_id"  width="200px">
                                <option value=""> All </option>
                        <c:forEach items="${customerTypeList}" var="customerType"  varStatus="i">
                            <option value="${customerType.getCustomerTypeId()}">${customerType.getCustomerTypeName()} </option>
                        </c:forEach>

                            </select>
                            <input type="submit" value="OK ">
                        </form>
                    </div>
                    <div class="row col-lg-12 "  style="
    padding-left: 0px;
    padding-right: 0px;
    margin-right: 0px;
    margin-left: 0px;">
                            <table id="tablePhanTrang"  class="  table table-striped table-bordered  table-responsive  "  >
                                <thead class="thead-dark">
                                <tr>
                                    <th scope="col">STT</th>
                                    <th scope="col">ID</th>
                                    <th scope="col">type_id</th>
                                    <th scope="col">name</th>
                                    <th scope="col">birthday</th>
                                    <th scope="col"> gender </th>
                                    <th scope="col"> id_card </th>
                                    <th scope="col"> phone </th>
                                    <th scope="col"> email </th>
                                    <th scope="col"> address </th>
                                    <th scope="col"> Sua </th>
                                    <th scope="col"> Xoa </th>

                                </tr>
                                </thead>
                                <tbody>

                                <c:if test="${customers != null}" >
                                    <c:forEach items="${customers}" var="cus" varStatus="i">
                                        <tr>
                                            <td scope="row"> ${ i.count}    </td>
                                            <td > ${   cus.getCustomer_id() }    </td>
                                            <td > ${   cus.getCustomer_type_id() }    </td>
                                            <td > ${   cus.getCustomer_name() }    </td>
                                            <td > ${   cus.getCustomer_birthday() }    </td>

                                            <c:if test="${ cus.isCustomer_gender()  == true}"> <td > male   </td> </c:if>
                                            <c:if test="${ cus.isCustomer_gender() == false  }"> <td > female   </td> </c:if>
                                            <td > ${   cus.getCustomer_id_card() }    </td>
                                            <td > ${   cus.getCustomer_phone() }    </td>
                                            <td > ${   cus.getCustomer_email() }    </td>
                                            <td > ${   cus.getCustomer_address() }    </td>

                                            <td>
                                                <c:if test="${sessionScope.user == null}">
                                                    <button type="button" id="btnEdit" class="btn btn-outline-info" data-toggle="modal"  data-target="#modelFail">
                                                        Edit
                                                    </button>
                                                </c:if>

                                                <c:if test="${sessionScope.user != null}">
                                                    <a href="/customer?action=edit&id=${ cus.getCustomer_id()}"><button type="submit"   class="btn btn-outline-info" >
                                                        Edit
                                                    </button></a>
                                                </c:if>
                                            </td>

                                            <td>
                                                <button type="button" id="btnDel" onclick=" showModelDelete('${ cus.getCustomer_id() }','${cus.getCustomer_name()}'); "
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
        </div>


</body>
</html>
