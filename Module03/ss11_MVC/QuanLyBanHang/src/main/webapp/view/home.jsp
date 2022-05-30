<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/26/2022
  Time: 12:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>

    <title>Danh sach Product</title>
</head>
<body>
<h1 style="text-align:center" >Danh sach Product</h1>
<br>
<form action="/product" method="get" >
    <div class="form-group ml-5"  >
        <table >
            <tr>
                <td>
                    <input type="submit" name="state" value="add"   value="Them" style="   ;width: 70px ; height: 40px; background-color: rgba(33, 70, 192, 0.766);";>
                </td>
            </tr>
        </table>
    </div>
</form>

<br>

<div>
    <div class="w-100 h-75 mr-5  ">
        <table  class="  table table-striped table-bordered ">
            <thead class="thead-dark">
            <tr>
                <th scope="col">So thu tu</th>
                <th scope="col">id</th>
                <th scope="col">name</th>
                <th scope="col">price</th>
                <th scope="col">Mo ta</th>
                <th scope="col"> Sua </th>
                <th scope="col"> Xoa </th>

            </tr>
            </thead>
            <tbody>

            <c:if test="${productList != null}" >
                <c:forEach items="${productList}" var="product" varStatus="i">
                    <tr>
                        <td scope="row"> ${i.count}    </td>
                        <td scope="row"> ${product.getId()}    </td>
                        <td > ${product.getName()}     </td>


                        <td > ${product.getPrice()}    </td>
                        <td > ${product.getDesc()}    </td>
                        <td><a  href="/product?state=edit&id=${product.getId()}">  <button>Sua</button></a> </td>
                        <td><a href="/product?state=delete&id=${product.getId()}">  <button>Xoa</button></a> </td>

                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>


</div>



</body>
</html>
