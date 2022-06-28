<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>tra sach</title>


    <link rel="stylesheet" href="bootstrap4.6.0/css/bootstrap.min.css">
    <script src="jquery/jquery-3.6.0.min.js"></script>
    <script src="bootstrap4.6.0/js/bootstrap.min.js"></script>


</head>
<body >
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px"> Trả sách </h1>
<form method="post" action="/muon?action=tra" style="margin-left: 150px; margin-right: 150px">

    <div class="form-row " hidden >
        <div class="col-md-6 mb-4">
            <label >id sach </label>
            <input name="maSach"   type="text"  value="${ theMuon.getMaSach()}">
        </div>
    </div>

    <div class="form-row "  >
        <div class="col-md-6 mb-4">
            <label >Mã mượn sách</label>
            <input name="maMuon" readonly   type="text"  value="${ theMuon.getMaMuon()  }">
        </div>
    </div>

    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label >Tên sách</label>
            <input name="tenSach"  type="text" class="form-control" readonly value="${  theMuon.getSach().getTenSach() }  " placeholder="Nhap name" >
        </div>

        <div class="col-md-6 mb-4">
            <label >Tên Học Sinh</label>
            <input name="tenHocSinh"  type="text" class="form-control" readonly value="${   theMuon.getHocSinh().getTen() }  " placeholder="Nhap name" >

            <%--            <select name="maHocSinh" class="form-control">--%>
            <%--                        <c:forEach items="${hocSinhList}" var="hs"  varStatus="i">--%>
            <%--                            <option value="${hs.getMaHocSinh()}">${hs.getTen()} </option>--%>
            <%--                        </c:forEach>--%>
            <%--            </select>--%>
        </div>

    </div>


    <div class="form-row">


        <div class="col-md-6 mb-4">
            <label >Ngày Mượn</label>
            <input name="ngayMuon" id="theDateMuon"    type="date" class="form-control"   placeholder="dd-mm-yyyy"  min="1997-01-01" max="2030-12-31"  value="${theMuon.getNgayMuon()  }" required>
        </div>

        <div class="col-md-6 mb-4">
            <label >Ngày Trả</label>
            <input name="ngayTra"   type="date" class="form-control"    placeholder="dd-mm-yyyy"  min="1997-01-01" max="2030-12-31"   value="${theMuon.getNgayTra()  }" required>
        </div>
    </div>



    <button class="btn btn-primary" type="submit">Trả</button>
    <a href="/muon"><input    type="button" class="btn btn-primary" value="Back" >
    </a>


    <%--    <button class="btn btn-primary"    onclick="window.history.back();">Cancel</button>--%>

</form>

<%--<script>--%>
<%--    var date = new Date();--%>

<%--    var day = date.getDate();--%>
<%--    var month = date.getMonth() + 1;--%>
<%--    var year = date.getFullYear();--%>

<%--    if (month < 10) month = "0" + month;--%>
<%--    if (day < 10) day = "0" + day;--%>

<%--    var today = year + "-" + month + "-" + day;--%>
<%--    document.getElementById("theDateMuon").value = today;--%>
<%--</script>--%>
</body>
</html>
