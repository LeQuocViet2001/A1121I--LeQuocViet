<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container-fluid">
    <div  class="row   " >


                <div class="col-lg-5">
                    <c:if test="${ sessionScope.msgSucces != null }">
                        <div class="alert alert-info  alert-dismissible " style="width: 300px">
                            <h6>${  sessionScope.msgSucces.toString() }</h6>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">&times;</button>
                            <% session.removeAttribute("msgSucces") ;%>
                        </div>
                    </c:if>

                    <c:if test="${ sessionScope.msgFail != null }">
                        <div class="alert alert-info  alert-danger " style="width: 300px">
                            <span>${  sessionScope.msgFail.toString() } </span>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">&times;</button>
                            <% session.removeAttribute("msgFail") ;%>

                        </div>
                    </c:if>
                    <% session.invalidate();%>


<%--                    <c:if test="${  msgFail != null }">--%>
<%--                        <div class="alert alert-info  alert-danger " style="width: 300px">--%>
<%--                            <span>${  msgFail } </span>--%>
<%--                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">&times;</button>--%>
<%--                            <%      request.removeAttribute("msgFail");  %>--%>
<%--                        </div>--%>
<%--                    </c:if>--%>

<%--                    <c:if test="${ sessionScope.msgWarring != null }">--%>
<%--                        <div class="alert alert-warning  alert-dismissible " style="width: 400px">--%>
<%--                            <h6>${  sessionScope.msgWarring.toString() }</h6>--%>
<%--                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">&times;</button>--%>
<%--&lt;%&ndash;                            <% session.removeAttribute("msgWarring") ;%>&ndash;%&gt;--%>
<%--                        </div>--%>
<%--                    </c:if>--%>


                </div>

                <div class="col-7 col-lg-7 " style="text-align: left; margin-top: 5px; margin-bottom: 5px" >
                    <h3>Quản Lý Sản Phẩm</h3>
                </div>
    </div>
</div>


    <%--navbar--%>
    <div class="row ">
        <nav class="navbar navbar-expand-lg navbar-light bg-light col-lg-12  " style="padding-top: 0px; padding-bottom: 0px;">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav mr-auto">

<%--                    <li class="nav-item active" style="margin-left: 50px; margin-right: 50px">--%>
<%--                        <a class="nav-link" href="/sach"> Quản Lý Sản Phẩm </a>--%>
<%--                    </li>--%>

<%--                    <li class="nav-item active"  style="margin-left: 50px; margin-right: 50px">--%>
<%--                        <a class="nav-link" href="/muon">Thong Ke Sach </a>--%>
<%--                    </li>--%>

                </ul>


                <form method="post" hidden action="/login?action=logout"  class="form-inline my-2 my-lg-0">
                    <button  class="btn btn-outline-success my-2 my-sm-0" type="submit" >LogOut</button>
                </form>

            </div>
        </nav>

    </div>



<footer class="footer  bg-dark" style="    position: absolute;
    bottom: 0;
    width: 100%;
    height: 5vh; /* Set the fixed height of the footer here */
    /*line-height: 60px; !* Vertically center the text there *!*/
    text-align:center;
    font-size:20px;
    font-weight: bold;">
    <div class="container">
        <%--                    mt-auto py-3--%>
        <span class="text-light">Place sticky footer content here.</span>
    </div>
</footer>



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



<%--Model tìm kim--%>