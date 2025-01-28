<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 60%;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h3 {
            text-align: center;
            color: #333;
        }
        p {
            font-size: 18px;
            text-align: center;
            color: #555;
        }
        table {
            width: 100%;
            margin-top: 20px;
            border-collapse: collapse;
        }
        td, th {
            padding: 8px 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .submit-btn {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
            margin-top: 20px;
        }
        .submit-btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>User Details</h3>

        <!-- Display user details in a table -->
        <table>
            <tr>
                <th>User ID</th>
                <td>${user.userId}</td>
            </tr>
            <tr>
                <th>User Name</th>
                <td>${user.userName}</td>
            </tr>
            <tr>
                <th>Mobile Number</th>
                <td>${user.mobileNumber}</td>
            </tr>
        </table>

        <form action="userList" method="get">
            <button type="submit" class="submit-btn">Back to User List</button>
        </form>
    </div>
</body>
</html>
