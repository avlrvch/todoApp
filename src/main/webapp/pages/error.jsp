<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="/styles/error.css"/>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <div class="errorMsgContainer">
        <h3>Ooops, something went wrong</h3>
        <a href="${pageContext.request.contextPath}/pages/welcome.jsp" class="backLink">Try Again </a>
    </div>
</body>
</html>
