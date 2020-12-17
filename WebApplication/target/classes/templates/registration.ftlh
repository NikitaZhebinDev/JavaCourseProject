<#import "parts/page.ftlh" as p>
<#import "parts/login.ftlh" as l>

<@p.page>


<h1> Регистрация</h1>

<#if msg_user_status??>
${msg_user_status}
<#else>
</#if>


<@l.login "/registration" />


</@p.page>