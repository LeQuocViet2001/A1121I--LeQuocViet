<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thêm Sản Phẩm</title>


    <link rel="stylesheet" href="bootstrap4.6.0/css/bootstrap.min.css">
    <script src="jquery/jquery-3.6.0.min.js"></script>
    <script src="bootstrap4.6.0/js/bootstrap.min.js"></script>


</head>
<body >
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px"> Thêm Sản Phẩm</h1>
<form method="post" action="/home?action=add" style="margin-left: 150px; margin-right: 150px">

<%--    <div class="form-row " hidden >--%>
<%--        <div class="col-md-6 mb-4">--%>
<%--            <label >id sach </label>--%>
<%--            <input name="maSach"   type="text"  >--%>
<%--        </div>--%>
<%--    </div>--%>



    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >Tên </label>
            <input name="ten"   type="text" class="form-control"  value="">
        </div>


    </div>

    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >Giá</label>
            <input name="gia"  type="number" class="form-control"  value="" placeholder="Nhap giá" >
        </div>


        <div class="col-md-6 mb-4">
            <label >Số Lượng</label>
            <input name="soLuong"  type="number" class="form-control"  value="" placeholder="Nhap số lượng" >
        </div>

    </div>


    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >Màu sắc</label>
            <input name="mau"  type="text" class="form-control"  value="" placeholder="Nhap màu sắc" >
        </div>


        <div class="col-md-6 mb-4">
            <label >Mô Tả</label>
            <input name="moTa"  type="text" class="form-control"  value="" placeholder="Nhap mô tả" >
        </div>


        <div class="col-md-6 mb-4">
            <label >Danh Mục</label>
            <select name="idMuc" class="form-control">
                <c:forEach items="${categoryList}" var="dmuc"  varStatus="i">
                    <option value="${dmuc.getIdMuc()}">${dmuc.getTenMuc()} </option>
                </c:forEach>
            </select>
        </div>

    </div>



    <button class="btn btn-primary" type="submit">ADD</button>
    <a href="/home"><input    type="button" class="btn btn-primary" value="BACK" >
    </a>


    <%--    <button class="btn btn-primary"    onclick="window.history.back();">Cancel</button>--%>

</form>


</body>
</html>
