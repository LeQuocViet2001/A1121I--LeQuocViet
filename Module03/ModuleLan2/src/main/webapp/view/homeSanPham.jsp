<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/15/2022
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css" />

    <%--    <link rel="stylesheet" href="css/sidebar.css">--%>
    <link rel="stylesheet" href="bootstrap4.6.0/css/bootstrap.min.css">
    <script src="jquery/jquery-3.6.0.min.js"></script>
    <script src="bootstrap4.6.0/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="/view/teamplate.jsp"%>
<div class="container-fluid row" style="
    margin-right: 0px;
    padding-right: 0px;
    margin-left: 0px;
    padding-left: 0px;
">

    <div class="col-lg-12">
                <%--        <h1 style="margin-top: 5px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 25px">Quản Lý Sản Phẩm</h1>--%>


                    <form method="post" action="/home" class="row col-lg-12 col-md-12 col-12 ">
                        <div class="col-lg-4">

                            <button type="submit" formmethod="get"  name="action" value="add" class="d-inline ml-5 btn btn-secondary">Add</button>

                        </div>
                        <div class="col-lg-5">

                        </div>

                        <div class="col-lg-3">
                            <input name="searchName"  type="text"  class="d-inline" placeholder="Search" value="${Name}">
                            <button type="submit"  formmethod="post" name="action" value="search"  class="d-inline  btn btn-secondary" >Tim Kiem</button>

                        </div>

                    </form>



        <div class="row col-lg-12 col-md-12 col-12 "  style="display: block;overflow: auto;margin-right: 0px;margin-left: 0px;padding-left: 0px;padding-right: 0px;margin-top: 0px;">
            <table id="tablePhanTrang" width="100%"  class="  table table-striped table-bordered  "   >
                <thead class="thead-dark">
                <tr>
                    <th scope="col">STT</th>
                    <th scope="col">ID</th>
                    <th scope="col">Tên Sản Phẩm</th>
                    <th scope="col">Giá</th>
                    <th scope="col">Số Lượng</th>
                    <th scope="col">Màu Sắc</th>
                    <th scope="col">Danh Mục</th>
                    <th scope="col"> Sửa </th>
                    <th scope="col"> Xóa </th>
                    <%--                    <th scope="col"> Xoa </th>--%>
                </tr>
                </thead>
                <tbody>
                <c:if test="${sanPhamList != null}" >
                    <c:forEach items="${sanPhamList}" var="sp" varStatus="i">
                        <tr>

                            <td > ${  i.count }    </td>
                            <td > ${   sp.getId() }    </td>
                            <td > ${   sp.getTen() }    </td>
                            <td > ${   sp.getGia() }    </td>
                            <td > ${   sp.getSoLuong() }    </td>
                            <td > ${   sp.getMauSac() }    </td>
<%--                            <td > ${   sp.getIdMuc() }    </td>--%>


                            <c:forEach items="${categoryList}" var="muc"  varStatus="i">
                                <c:if test="${ muc.getIdMuc() == sp.getIdMuc()   }">
                                    <td>   ${   muc.getTenMuc() }    </td>
                                </c:if>
                            </c:forEach>

                            <td>
                                <a href="/home?action=edit&id=${ sp.getId() }"><button    class="btn btn-outline-info" >
                                    Sửa
                                </button></a>
                            </td>
                            <td>
                                <button type="button" id="btnDel" onclick=" showModelDelete('${  sp.getId() }','${  sp.getTen()   }'); "
                                        class="btn btn-outline-danger" data-toggle="modal"  data-target="#modalDelete">
                                    Xóa
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



<div class="modal fade" id="modalDelete" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        thêm thẻ form--%>
        <form  action="/home?action=delete" id="modelForm"  method="post"  >
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Thong Bao</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>


                <div class="modal-body">
                    <input  hidden type="text" id="idDelete"  name="idDelete">
                    <span>Ban co muon xoa </span>
                    <span class="text-danger" id="hotenDelete"></span> khong?<span/>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>

            </div>
        </form>
    </div>
</div>
<script>
    function showModelDelete(id,name) {
        document.getElementById("idDelete"). value= id;
        document.getElementById("hotenDelete").innerText=name;
        // document.getElementById("modelForm").method = "post";

    }
</script>

</body>
</html>
