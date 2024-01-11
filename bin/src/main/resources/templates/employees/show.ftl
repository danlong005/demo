<html>
    <head>
        <title><#include "/partials/title.ftl"> - Show</title>
        <#include "/partials/header.ftl">
    </head>
<body>
    <form action="/v1/employees/delete" method="post">
        <input type="hidden" id="employee_id" name="employee_id" value="${employee.id}" />
        ${employee.firstName}
        
        <button type="submit">Delete</button>
    </form>
</body>
</html>