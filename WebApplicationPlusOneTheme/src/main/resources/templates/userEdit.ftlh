<#import "parts/page.ftlh" as p>
<#import "parts/login.ftlh" as l>
<@p.page>

<h1> Редактировать пользователя:</h1>

<form method="post" action="/userList">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="hidden" name="userId" value="${user.id}">
    <input type="text" name="username" value="${user.username}">
    <#list roles as role>
    <div>
        <label>
            <input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")}>
            ${role}
        </label>
    </div>
    </#list>
    <button type="submit">Сохранить</button>
</form>

</@p.page>