<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Update Todo</title>
  </head>
  <body>
    <form:form method="post" modelAttribute="todo">
       <form:input path="id" type="hidden" name="id" />
        Username: <input type="text" name="name" value=${name} disabled /> <br>
        Description: <form:input path="description" type="text" name="description" required="required" /> <form:errors path="description" /><br>
        Target Date: <form:input path="targetDate" type="date" name="targetDate" required="required" /> <form:errors path="targetDate" /> <br>
        <form:input path="done" type="hidden" name="done" /> <br>
        <button type="cancel">Cancel</button>
        <button type="submit">Update Todo</button>
    </form:form>
    <p>${errorMessage}</p>
  </body>
</html>