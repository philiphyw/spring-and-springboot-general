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
        <form:input path="username" type="hidden" name="username" />
        Username: <label>${todo.getUsername()} </label> <br>
        <fieldset>
            <form:label path="description">Description</form:label>
            <form:input path="description" type="text" name="description" required="required" />
            <form:errors path="description" />
        </fieldset>
        <fieldset>
            <form:label path="targetDate">Target Date</form:label>
            <form:input path="targetDate" type="text" name="targetDate" required="required" />
            <form:errors path="targetDate" />
        </fieldset>
        <form:input path="done" type="hidden" name="done" /> <br>
        <button type="cancel">Cancel</button>
        <button type="submit">Update Todo</button>
    </form:form>
    <p>${errorMessage}</p>
  </body>
</html>