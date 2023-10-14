<html>
    <head>
        <title><#include "/partials/title.ftl"> - Index</title>
        <#include "/partials/header.ftl">
    </head>
<body>
    <#list employees as employee>
        <p>${employee.firstName} - ${employee.lastName}</p>
    </#list>
</body>
</html>