<#import "parts/page.ftl" as p>
<#import "parts/login.ftl" as l>

<@p.page>


<h1> Вход в систему</h1>

<form action="http://localhost:8888/registration">
    <input type="submit" value="Регистрация"/>
</form>

<br><br>

<@l.login "/login" />


</@p.page>