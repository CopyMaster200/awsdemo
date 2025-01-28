<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enter User Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 50%;
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
        table {
            width: 100%;
            margin-top: 20px;
        }
        td {
            padding: 8px 12px;
            text-align: left;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        label {
            font-weight: bold;
            color: #333;
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
        }
        .submit-btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3>Enter User Details</h3>
        <form action="addUser" method="post">
            <table>
                <tr>
                    <td><label for="userName">Enter User Name:</label></td>
                    <td><input type="text" name="userName" id="userName" required></td>
                </tr>
                <tr>
                    <td><label for="mobileNumber">Enter Mobile Number:</label></td>
                    <td><input type="text" name="mobileNumber" id="mobileNumber" required></td>
                </tr>
                <tr>
                    <td><label for="email">Enter Email ID:</label></td>
                    <td><input type="text" name="email" id="email" required></td>
                </tr>
            </table>
            <button type="submit" class="submit-btn">Submit</button>
        </form>
    </div>
</body>
</html>
