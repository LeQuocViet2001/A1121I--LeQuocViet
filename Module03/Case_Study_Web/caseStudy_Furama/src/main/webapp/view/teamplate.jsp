<div class="container-fluid">
    <div  class="row header ">
        <div class="col-2 col-lg-2">
            <figure>
                <img style ="margin: auto;  " width="20px" height="20px"
                     src="https://lambanner.com/wp-content/uploads/2020/04/MNT-DESIGN-10-MEO-THIET-KE-LOGO.jpg">
                <figcaption > Logo </figcaption>
            </figure>
        </div>
<%--        thong bao--%>
        <div class="col-2 col-lg-2">
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

            <c:if test="${ sessionScope.msgWarring != null }">
                <div class="alert alert-warning  alert-dismissible " style="width: 400px">
                    <h6>${  sessionScope.msgWarring.toString() }</h6>
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">&times;</button>
                    <% session.removeAttribute("msgWarring") ;%>
                </div>
            </c:if>
        </div>


        <div class="col-5 col-lg-5">
            <h3>Case study</h3>
        </div>
        <div class="col-3 col-lg-3">
            Welcome: ${sessionScope.user.username}
        </div>

    </div>

    <%--navbar--%>
    <div class="row navHome ">
        <nav class="navbar navbar-expand-lg navbar-light bg-light col-lg-12  " style="padding-top: 0px; padding-bottom: 0px;">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active  "id="employee">
                        <a class="nav-link"  href="/employee"   >Employee </a>
                    </li>
                    <li class="nav-item active" id="Customer">
                        <a class="nav-link" href="/customer">Customer </a>
                    </li>

                    <li class="nav-item dropdown " style="list-style: none">
                        <a class="nav-link dropdown-toggle" href="#" id="asd" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           Service
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href=/service?show=house >Them Home</a>
                            <a class="dropdown-item" href="/service?show=room" >Them Room</a>
                            <a class="dropdown-item" href="/service?show=villa" >Them Villa</a>
                        </div>
                    </li>



                    <li class="nav-item active">
                        <a class="nav-link" href="/contract">Contract </a>
                    </li>
                </ul>


                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>

                <form method="get" action="/login"  class="form-inline my-2 my-lg-0">
                    <button  class="btn btn-outline-success my-2 my-sm-0" type="submit" >LogOut</button>
                </form>

            </div>
        </nav>

    </div>

</div>

<footer class="footer  bg-dark">
    <div class="container">
        <%--                    mt-auto py-3--%>
        <span class="text-light">Place sticky footer content here.</span>
    </div>
</footer>



<div class="modal fade" id="modalDelete" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        thêm thẻ form--%>
        <form  action="/employee?action=delete" id="modelForm"  method="post"  >
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Thong Bao</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>

                <c:if test="${sessionScope.user.role.role_Id  > 1}" >

                    <div class="modal-body">
                        <input  hidden type="text" id="idDelete"  name="idDelete">
                        <span>Ban co muon xoa </span>
                        <span class="text-danger" id="hotenDelete"></span> khong?<span/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </c:if>

                <c:if test="${sessionScope.user.role.role_Id  == 1}" >
                    <div class="modal-body ">
                        <span class="text-danger" ></span> Ban Khong Co Quyen<span/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">OK</button>
                    </div>
                </c:if>
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