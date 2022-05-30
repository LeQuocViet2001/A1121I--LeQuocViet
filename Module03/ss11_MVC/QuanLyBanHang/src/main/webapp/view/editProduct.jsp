<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/26/2022
  Time: 8:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<style>
    h1{
        color: #04AA6D;
    }
    table{
        width:300px;
        margin-bottom: 20px;
    }
    a{
        text-decoration:none;

        color: #000;
    }
    span{
        width: fit-content;
        border: solid 1px;
        padding: 2px;
        background-color: #f0f0f0;
    }
    input{
        height: 25px
    }
</style>
<header>
    <title>Sua san pham</title>
</header>
<body>
<center style>
    <form method="POST" action="/product?state=edit">
        <h1>Sua san pham</h1>
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" readonly name="id"  value=" ${product.getId()} "></td>
            </tr>

            <tr>
                <td>Tên</td>
                <td><input type="text" name="ten" value=" ${product.getName()}"></td>
            </tr>

            <tr>
                <td>price</td>
                <td><input type="text" name="price" value=" ${product.getPrice()}"></td>
            </tr>

            <tr>
                <td>Mo ta </td>
                <td><input type="text" name="mota" value=" ${product.getDesc()}"></td>
            </tr>

            <tr>
                <td>Nguon goc</td>
                <td><input type="text" name="origin" value=" ${product.getOrigin()}"></td>
            </tr>


        </table>
        <span><a href="/home">Quay lại</a></span>
        <input type="submit" value="Sua">
    </form>
</center>
</body>
</html>
