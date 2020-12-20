<#import "parts/page.ftlh" as p>
<#import "parts/login.ftlh" as l>
<@p.page>

<h1> Список пользователей:</h1>

<table>
    <thead>
    <tr>
        <th>Имя</th>
        <th>Роль</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <tr>
            <td>${user.username}</td>
            <td><#list user.roles as role> ${role}<#sep>, </#list></td>
            <td><@l.goToLink "/userList/${user.id}" "Редактировать"/></td>
        </tr>
    </#list>
    </tbody>
</table>

</@p.page>