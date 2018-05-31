<html>
    <head>
        <title> Welcome to Fruit Picker</title>
        </head>
    <body>
        <form action="/favourite_fruit" method="POST">
            <p>What is your favourite fruit?</p>
                <#list fruits as fruit>
                <input type="radio" name="fruit" value="${fruit}">${fruit}</input>
                </#list>
            <input type="submit" value="Submit">
            </form>
        </body>
    </html>