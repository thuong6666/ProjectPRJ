
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>
       
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        .content {
            margin: 20px;
        }
    </style>
        <title>Bill</title>
    </head>
    <body>
           <%@include file="header.jsp" %>
            <div class="page">

            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>IdUser</th>
                        <th>FullName</th>
                        <th>Date</th>
                        <th>Total</th>
                     
              
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${bill}" var="x">
                        <tr>
                            <td><a href="showbill?billID=${x.billID}">${x.billID}</a></td>
                            <td>${x.accID}</td>
                            <td>${x.fullName}</td> 
                            <td>${x.billDate}</td>
                            <td>${x.total}</td>
                            
                          
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
       </div>
    </body>
</html>
