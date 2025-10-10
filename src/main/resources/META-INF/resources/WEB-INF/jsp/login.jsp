<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
  </head>
  <body>
    <header>
      <h1>Please Login ${name}</h1>
    </header>
<form method="post">
    <div>
    <label for="name">Username:</label>
    <input id="name" name="name" type="text"/>
    </div>
    <div>
    <label for="password">Password:</label>
    <input id="password" name="password" type="password" />
    </div>
    <div>
    <button>Cancel</button>
    <button type="submit">Login</button>
    </div>
</form>
    <p>${errorMessage}</p>
  </body>
</html>