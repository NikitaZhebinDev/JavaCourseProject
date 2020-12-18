<#import "parts/page.ftlh" as p>
<#import "parts/login.ftlh" as l>
<@p.page>


<h1> Главная страница</h1>

<br><br>

<!-- -------------------- User data -------------------- -->
<#if user??>
<h3> Ваши данные:</h3>

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
<#else>
<h3> Войдите в систему</h3>
</#if>

<br><br>



<#if user??>
    <@l.logout />
<#else>
    <@l.goToLink "/registration" "Регистрация"/>
    <br>
    <@l.goToLink "/login" "Вход в систему"/>
    <br>
</#if>

<br><br>



<#if user??>
    <#if user.roles?seq_contains("ADMIN")>

<form method="get" action="/h2" >
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <button type="submit">Менеджмент Базы Данных</button>
</form>

<@l.goToLink "/userList" "Список пользователей"/>

    </#if>
</#if>


<!-- -------------------- Calculate budget function -------------------- -->
<h2> Бюджетирование </h2>

<div>
    <form method="post" action="calculate_budget">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="text" name="companyName" placeholder="Введите название компании"><br>
        <input type="text" name="projectName" placeholder="Введите название проекта"><br>
        <input type="text" name="staffSkillLevel" placeholder="Введите уровень квалификации специалистов"><br>
        <input type="number" name="staffNumber" placeholder="Введите кол-во сотрудников"><br>
        <input type="date" name="startDate" placeholder="Введите дату начала"><br>
        <input type="number" name="monthsNumber" placeholder="Введите кол-во месяцев"><br>
        <button type="submit">Вычислить</button><br>
    </form>
</div>
<!-- -------------------- Calculate budget function -------------------- -->


<!-- -------------------- Country section -------------------- -->
<br><br>

<form method="get" action="/">
    <input type="text" name="countryName" value="${countryName}">
    <button type="submit">Найти</button>
</form>


<H3>Список стран:</H3>

<table>
    <tr>
        <th>Название</th>
        <th>Валюта</th>
    </tr>
    <#list countries as country>
        <tr>
            <td><b>${country.name}</b></td>
            <td><span>${country.currency}</span></td>
        </tr>
    <#else>
    Коллекция пуста
    </#list>
</table>

<div>
    <form method="post" action="add_country">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="text" name="name" placeholder="Введите название">
        <input type="text" name="currency" placeholder="Введите валюту">
        <button type="submit">Добавить</button>
    </form>
</div>

<!-- -------------------- Company section -------------------- -->
<br>
<hr>
<br>

<H3>Список компаний:</H3>

<table>
    <tr>
        <th>Название</th>
        <th>Страна</th>
        <th>Текущий бюджет</th>
        <th>Выделенный бюджет</th>
        <th>Дата основания</th>
    </tr>
    <#list companies as company>
        <tr>
            <td><b>${company.name}</b></td>
            <td><span>${company.countryName}</span></td>
            <td><span>${company.currentBudget}</span></td>
            <td><span>${company.allocatedBudget}</span></td>
            <td><span>${company.foundationDate}</span></td>
        </tr>
    </#list>
</table>

<!-- -------------------- Project section -------------------- -->
<br>
<hr>
<br>

<H3>Список проектов:</H3>

<table>
    <tr>
        <th>ID</th>
        <th>Название</th>
        <th>Компания</th>
        <th>Уровень квалификации сотрудников</th>
        <th>Кол-во сотрудников</th>
        <th>ID бюджета</th>
    </tr>
    <#list projects as project>
        <tr>
            <td><b>${project.id}</b></td>
            <td><span>${project.name}</span></td>
            <td><span>${project.companyName}</span></td>
            <td><span>${project.staffSkillLevel}</span></td>
            <td><span>${project.staffNumber}</span></td>
            <td><span>${project.budgetId}</span></td>
        </tr>
    </#list>
</table>

<!-- -------------------- Budget section -------------------- -->
<br>
<hr>
<br>

<H3>Бюджеты:</H3>

<table>
    <tr>
        <th>ID</th>
        <th>Дата начала</th>
        <th>Дата окончания</th>
        <th>Кол-во месяцев</th>
        <th>Ежемесячная плата</th>
        <th>Всего к оплате</th>
        <th>Валюта</th>
    </tr>
    <#list budgets as budget>
        <tr>
            <td><b>${budget.id}</b></td>
            <td><span>${budget.startDate}</span></td>
            <td><span>${budget.finishDate}</span></td>
            <td><span>${budget.monthsNumber}</span></td>
            <td><span>${budget.monthlyPayment}</span></td>
            <td><span>${budget.totalPayment}</span></td>
            <td><span>${budget.currency}</span></td>
        </tr>
    </#list>
</table>

<!-- -------------------- Skill Payment section -------------------- -->
<br>
<hr>
<br>

<H3>Средние выплаты согласно уровню специалиста и страны проживания:</H3>

<table>
    <tr>
        <th>ID</th>
        <th>Страна</th>
        <th>Уровень квалификации сотрудника</th>
        <th>Ежемесячная плата</th>
    </tr>
    <#list skillPayments as sp>
        <tr>
            <td><b>${sp.id}</b></td>
            <td><span>${sp.countryName}</span></td>
            <td><span>${sp.skillLevel}</span></td>
            <td><span>${sp.monthlyPayment}</span></td>
        </tr>
    </#list>
</table>


<br><br>


</@p.page>