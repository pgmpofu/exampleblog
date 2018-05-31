<html>
    <head>
        <title> Welcome to Fruit Picker</title>
    </head>
    <body>
        <form action="/favourite_fruit" method="POST">
            <p>What is your favourite fruit?</p>
                <#list fruits as fruit>
                <p><input type="radio" name="fruit" value="${fruit}">${fruit}</input></p>
             <#/list>
             <input type="submit">Submit</input>
        </form>
    </body>
</html>