<#import "login.ftlh" as l>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Главная</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <ul class="navbar-nav mr-auto">
            <#if user??>
            <#if user.roles??>
            <#if user.roles?seq_contains("ADMIN")>
                <li class="nav-item active">
                    <a class="nav-link" href="/h2" target="_blank">Менеджмент Базы Данных</a>
                </li>
                <li class="nav-item active">
                    <@l.goToLink "/userList" "Список пользователей"/>
                </li>
            </#if>
            </#if>
            </#if>
        </ul>

        <#if user??>
        <#if user.roles??>
            <table>
                <thead>
                <tr>
                    <th>Имя</th>
                    <th>Роль</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${user.username}</td>
                    <td><#list user.roles as role> ${role}<#sep>, </#list></td>
                </tr>
                </tbody>
            </table>
        </#if>
        </#if>
    </div>
</nav>