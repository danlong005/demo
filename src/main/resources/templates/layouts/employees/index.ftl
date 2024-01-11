<div>
<ul>
<#list employees as employee>
    <li>
        <a href="/v1/employees/${employee.id}">${employee.firstName} ${employee.lastName}</a>
    </li>
</#list>
</ul>

<a href="/v1/employees/new">New Employee</a>
</div>