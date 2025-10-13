<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Todo List</title>
  </head>
  <body>
    <header>
      <h1>Welcome ${name}</h1>
    </header>

<table>
<thead>
<tr>
<th>id</th>
<th>Description</th>
<th>Target Date</th>
<th>Done</th>
<th></th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos}" var="todo">
<tr>
<td>${todo.id}</td>
<td>${todo.description}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>
<td><a href="update-todo?id=${todo.id}">Update</a></td>
<td><a href="delete-todo?id=${todo.id}">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>
    <a href="add-todo">Add new Todo</a>
    <p>${errorMessage}</p>
  </body>
</html>