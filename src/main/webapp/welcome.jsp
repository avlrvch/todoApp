<%@ taglib prefix="s" uri="/struts-tags" %>

<html>

<body>
    <h1>TO DO App</h1>

    <h3>Create new TODO:</h3>
    <s:form action="addToDo" name="newToDoForm" method="GET">
        <s:textfield name="description" label="Enter your Task Description"/>
        <s:submit/>
    </s:form>

    <h3>
        <%--<s:bean name="ua.net.azhytnytskyi.model.ToDoEntry" var="vvv">--%>
            <%--<s:param name="description">3</s:param>--%>
        <%--</s:bean>--%>

        <s:iterator value="toDoList">
            <s:label value="Task:"/>
            <s:textfield name="description" style="width:300px"/>
            <s:select label="Status"
                      headerKey="status" headerValue="Select Status"
                      list="status"
                      name="status"
                      style="width:200px"/>
            <s:hidden name="description" value="description"/>

            <s:form>
            <s:url id="delete" action="delete" >
                <s:param name="description" value="description"/>
            </s:url>
            <s:a href="delete">Delete</s:a>

            <s:url id="save" action="save" >
                <s:param name="description" value="description"/>
            </s:url>
            <s:a href="save">Save</s:a>

            <br>
            </s:form>
        </s:iterator>
    </h3>

</body>
</html>