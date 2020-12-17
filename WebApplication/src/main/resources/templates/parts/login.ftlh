<#macro login path>
<form action="${path}" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <div><label> Имя: <input type="text" name="username"/> </label></div>
    <div><label> Пароль: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Вход"/></div>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Выйти из системы"/>
</form>
</#macro>

<#macro goToLink link msg>
<form action="${link}">
    <input type="submit" value="${msg}"/>
</form>
</#macro>