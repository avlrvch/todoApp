<%@ taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" type="text/css" href="/styles/main.css"/>

<html>

<body>
    <s:div class="headedBanner">
        <s:label name="ToDo App"/>
    </s:div>

    <s:div class="createNewToDo">
        <s:label value="Create new TODO:"/>
        <s:form action="addToDo" name="newToDoForm" method="GET">
            <s:textfield name="description" value=""/>
            <s:submit/>
        </s:form>
    </s:div>

        <s:iterator value="toDoList">
            <s:form action="save">
                <s:hidden name="id"/>
                <s:textfield label="Task" name="description"/>
                <s:select label="Status"
                          headerKey="status"
                          list="statuses"
                          name="status"/>
                <s:submit value="Save"/>
            </s:form>
            <br>
        </s:iterator>
</body>

</html>