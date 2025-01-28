<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .container {
            width: 80%;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        table {
            width: 100%;
            margin-top: 20px;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px 12px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
            color: #333;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .total-users {
            text-align: center;
            font-size: 18px;
            margin: 20px 0;
            color: #555;
        }

        .message {
            text-align: center;
            font-size: 18px;
            color: #555;
        }

        .user-list-table {
            width: 100%;
            border-collapse: collapse;
        }

        .user-list-table th, .user-list-table td {
            padding: 8px;
            text-align: left;
            border: 1px solid #ddd;
        }

        .user-list-table th {
            background-color: #f2f2f2;
        }

        .user-list-table tr:hover {
            background-color: #f5f5f5;
        }

    </style>
</head>
<body>
    <div class="container">
        <h1>User List</h1>
        <div class="message">${message}</div>
        <div class="message">Total Users: ${totalUsers}</div>
        <table class="user-list-table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Mobile Number</th>
                    <th>Email ID</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td>${user.userId}</td>
                        <td>${user.userName}</td>
                        <td>${user.mobileNumber}</td>
                        <td>${user.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
