<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Add Todo</title>
  </head>
  <body>
    <header>
      <h1>Welcome ${name}, Please enter todo detail</h1>
    </header>
    <form method="post">
        Username: <input type="text" name="name" value=${name} disabled />
        Description: <input type="text" name="description" />
        Target Date: <input type="date" name="targetDate" />
        <button type="cancel">Cancel</button>
        <button type="submit">Add Todo</button>
    </form>
    <p>${errorMessage}</p>
  </body>
</html>