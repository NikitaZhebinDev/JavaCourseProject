<#import "parts/page.ftl" as p>
<#import "parts/login.ftl" as l>

<@p.page>


<h1> Регистрация</h1>

${msg_user_status}

<@l.login "/registration" />


</@p.page>