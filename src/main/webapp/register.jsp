<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Employee Details</h1>
    <form:form action="register" method="post" modelAttribute="emp">
    	<!-- <label for="id">Id: <input type="text" name="id"></label> <br> -->
        <label for="name">Name: <input type="text" name="name"></label> <br>
        <label for="mobile_no">Mobile No.: <input type="text" name="mobile_no"></label> <br>
        <label for="department">Department: <input type="text" name="department"></label> <br>
        <label for="designation">Designation: <input type="text" name="designation"></label> <br>
        <label for="skills">Skills: <input type="text" name="skills"></label> <br>
        <button type="submit" name="Submit">Submit</button>
    </form:form>
</body>
</html>