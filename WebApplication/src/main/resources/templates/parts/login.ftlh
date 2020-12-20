<#macro login path>
<form action="${path}" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">

    <div class="form-group">
        <label class="col-sm-2 col-form-label">
            Имя: <input type="text" name="username" class="form-control"/>
        </label>
        <label class="col-sm-2 col-form-label">
            Пароль: <input type="password" name="password" class="form-control"/>
        </label>
        <button type="submit" class="btn btn-primary">Вход</button>
    </div>
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
    <button type="submit" class="btn btn-primary">${msg}</button>
</form>
</#macro>