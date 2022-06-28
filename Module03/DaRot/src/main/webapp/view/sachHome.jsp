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
        <h1 style="margin-top: 5px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 25px">Danh sách Sách</h1>
<%--        <div class="row col-lg-12" style=" display: flex;align-items: center; justify-content: center;" >--%>
<%--            <form method="post" action="/items">--%>
<%--                <button type="submit" formmethod="get"  name="action" value="add" class="d-inline ml-5 btn btn-secondary">Add</button>--%>

<%--                <input name="searchName" value="${searchName}" type="text"  class="d-inline" placeholder="name">--%>
<%--                <input name="searchCountry" value="${searchCountry}" type="text"  class="d-inline" placeholder="country">--%>

<%--                <div class="form-check form-check-inline">--%>
<%--                    <input class="form-check-input" checked  type="radio" name="SearchStatus"  value="false" />--%>
<%--                    <label class="form-check-input" >Nu</label>--%>
<%--                </div>--%>
<%--                <c:choose>--%>
<%--                    <c:when test="${ items.isStatus() }">--%>
<%--                        <div class="form-check form-check-inline">--%>
<%--                            <input class="form-check-input" type="radio" checked   name="SearchStatus"  value="true" />--%>
<%--                            <label class="form-check-input"   >Nam</label>--%>
<%--                        </div>--%>
<%--                    </c:when>--%>
<%--                    <c:otherwise>--%>
<%--                        <div class="form-check form-check-inline">--%>
<%--                            <input class="form-check-input" type="radio"    name="SearchStatus"  value="true" />--%>
<%--                            <label class="form-check-input"   >Nam</label>--%>
<%--                        </div>--%>
<%--                    </c:otherwise>--%>
<%--                </c:choose>--%>

<%--                <select name="searchBox" style="width: 300px" class="form-control d-inline">--%>
<%--                    <option value="" selected> All Box </option>--%>
<%--                    <c:forEach items="${boxList}" var="box"  varStatus="i">--%>
<%--                        <c:if test="${ box.getBoxId().toString()  ==  searchBox}">--%>
<%--                            <option selected value="${box.getBoxId()}"> ${box.getName()} </option>--%>
<%--                        </c:if>--%>

<%--                        <c:if test="${ box.getBoxId().toString()  !=  searchBox}">--%>
<%--                            <option  value="${box.getBoxId()}"> ${box.getName()} </option>--%>
<%--                        </c:if>--%>
<%--                    </c:forEach>--%>
<%--                </select>--%>
<%--                <button type="submit"  class="d-inline" formmethod="post" name="action" value="search"  class="d-inline ml-5 btn btn-secondary" >Tim Kiem</button>--%>
<%--            </form>--%>
<%--        </div>--%>
        <%--            tabe--%>
        <div class="row col-lg-12 col-md-12 col-12 "  style="display: block;overflow: auto;margin-right: 0px;margin-left: 0px;padding-left: 0px;padding-right: 0px;margin-top: 0px;">
            <table id="tablePhanTrang" width="100%"  class="  table table-striped table-bordered  "   >
                <thead class="thead-dark">
                <tr>
                    <th scope="col">Mã Sách</th>
                    <th scope="col">Tên Sách</th>
                    <th scope="col">Tác giả</th>
                    <th scope="col">Số Lượng</th>
                    <th scope="col">Mô tả</th>
                    <th scope="col"> Mượn </th>
<%--                    <th scope="col"> Xoa </th>--%>
                </tr>
                </thead>
                <tbody>
                <c:if test="${sachList != null}" >
                    <c:forEach items="${sachList}" var="sach" varStatus="i">
                        <tr>

                            <td > ${   sach.getMaSach() }    </td>
                            <td > ${   sach.getTenSach() }    </td>
                            <td > ${   sach.getTacGia() }    </td>
                            <td > ${   sach.getSoLuong() }    </td>
                            <td > ${   sach.getMoTa() }    </td>

                            <td>
                                <a href="/sach?action=muon&id=${ sach.getMaSach() }"><button    class="btn btn-outline-info" >
                                    Mượn
                                </button></a>
                            </td>
<%--                            <td>--%>
<%--                                <button type="button" id="btnDel" onclick=" showDetail('${  sach.getMaSach() }','${sach.getSoLuong()}'); "--%>
<%--                                        class="btn btn-outline-danger" data-toggle="modal"  data-target="#modalSoLuong">--%>
<%--                                    Muon--%>
<%--                                </button>--%>
<%--                            </td>--%>
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


<%--<div class="modal fade" id="modalSoLuong" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        &lt;%&ndash;        thêm thẻ form&ndash;%&gt;--%>
<%--        <form  action="/items?action=delete" id="modelForm"  method="post"  >--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="staticBackdropLabel">Thong Bao</h5>--%>
<%--                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                        <span aria-hidden="true">&times;</span>--%>
<%--                    </button>--%>
<%--                </div>--%>

<%--                <c:if test="${sach.getSoLuong() == 0}">--%>
<%--                    <div class="modal-body">--%>
<%--                        <span>Loi </span>--%>
<%--                    </div>--%>
<%--                    <div class="modal-footer">--%>
<%--                        <button type="button" class="btn btn-secondary" data-dismiss="modal">OK</button>--%>
<%--                    </div>--%>
<%--                </c:if>--%>
<%--                <c:if test="">--%>
<%--                    <div class="modal-body">--%>
<%--                        <input  hidden type="text" id="idDelete"  name="idDelete">--%>
<%--                        <span>Loi </span>--%>
<%--                        <span class="text-danger" id="hotenDelete"></span> khong?<span/>--%>
<%--                    </div>--%>
<%--                    <div class="modal-footer">--%>
<%--                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                        <button type="submit" class="btn btn-primary">Delete</button>--%>
<%--                    </div>--%>

<%--                </c:if>--%>



<%--                &lt;%&ndash;                <c:if test="${sessionScope.user.role.role_Id  == 1}" >&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <div class="modal-body ">&ndash;%&gt;--%>
<%--                &lt;%&ndash;                        <span class="text-danger" ></span> Ban Khong Co Quyen<span/>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    </div>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    <div class="modal-footer">&ndash;%&gt;--%>
<%--                &lt;%&ndash;                        <button type="button" class="btn btn-secondary" data-dismiss="modal">OK</button>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                    </div>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                </c:if>&ndash;%&gt;--%>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<script>--%>
<%--    function showDetail( id , soLuong) {--%>



<%--        document.getElementById("idDelete"). value= id;--%>
<%--        document.getElementById("hotenDelete").innerText=name;--%>



<%--        // document.getElementById("modelForm").method = "post";--%>

<%--    }--%>
<%--</script>--%>

</body>
</html>
