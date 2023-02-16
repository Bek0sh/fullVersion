<!DOCTYPE html>
<html>
<head>
    <title>MarketPlace</title>
</head>
<body>
<h1>MarketPlace</h1><hr>
<h4>You can find everything that you want in Kazakhstan</h4>

<form action="/" method="get">
    Find what you need: <input type="text" name="title"><br>
    <input type="submit" value="Search">
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} $ | <a href="/product/${product.id}">More info...</a></p>
    </div>
    <#else>
    <h4>
        There is no product
    </h4>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Name of product: <input type="text" name="title"/><br><br>
    Description: <input type="text" name="description"/><br><br>
    Price: <input type="number" name="price"/><br><br>
    City: <input type="text" name="city"/><br><br>
    Author: <input type="text" name="author"/><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>