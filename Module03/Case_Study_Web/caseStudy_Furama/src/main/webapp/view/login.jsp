<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">00
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            display: flex;
            color: #5e3bb6;
        }

        .login {

            margin: auto;
            margin-top: 100px;
            text-align: center}

        .input {
            width:600px;
            display: flex;
            margin-bottom: 10px;

        }

        .title {
            min-width: 150px;
        }

        input {
            width: 450px;
            padding: 5px;
        }

        /*.buttonInput {*/
        /*    margin-left: 100px;*/

        /*}*/

        button {
            background-color: #5e3bb6;
            padding: 5px;
            border: none;
            color: aliceblue;
            border-radius: 5px;
            cursor: pointer;
        }

    </style>
</head>

<body>


<div class="login" style="text-align: center">
    <h4>Login</h4>
    <c:if test="${msg != null}" >
        <p class="text-danger"> ${msg}</p>
    </c:if>
    <form   action="/login"  method="post" style="text-align: center">
        <div class="input" >
            <%--@declare id="username"--%><label class="title" for="username"  >username: </label>
            <input type="text" name="username" value="${username}" placeholder="username"/>
        </div>
        <div class="input ">
            <label  class="title"> password: </label>
            <input type="password" name="password"  value="${password}" placeholder="password"/>
        </div>
        <div class="input ">
            <input type="checkbox" name="cookie"  value="1" >  <label  class="title">Remember me. </label>
        </div>

        <div class="buttonInput">
            <button>Login</button>
            <button>Cancel</button>
        </div>
    </form>
</div>


<%--<div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        &lt;%&ndash;        thêm thẻ form&ndash;%&gt;--%>
<%--            <div class="modal-content">--%>
<%--                <div class="modal-header">--%>
<%--                    <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>--%>
<%--                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                        <span aria-hidden="true">&times;</span>--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <input  hidden type="text" id="idStudent" name="idDelete">--%>
<%--                    <span>Dang nhap that bai</span>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                    <button type="submit" class="btn btn-primary">OK</button>--%>
<%--                 --%>
<%--                </div>--%>
<%--            </div>--%>

<%--    </div>--%>
<%--</div>--%>


</body>
</html>