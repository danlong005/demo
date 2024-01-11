<form action="/v1/employees/create" method="post">
    <table>
        <tr>
            <td>FirstName:</td>
            <td>
                <input type="text" id="first_name" name="first_name" />
            </td>
        </tr>
        <tr>
            <td>LastName:</td>
            <td>
                <input type="text" id="last_name" name="last_name" />
            </td>
        </tr>
        <tr>
            <td>Hired At:</td>
            <td>
                <input type="text" id="hired_at" name="hired_at" />
            </td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td>
                <input type="text" id="salary" name="salary" />
            </td>
        </tr>
    </table>
    <button type="submit">Create</button>
</form>