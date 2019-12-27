<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
</head>

<body>

	<c:if test="${not empty empresa }">
		Empresa ${ empresa } cadastrada com sucesso.
	</c:if>
	
	<c:if test="${empty empresa }">
		Nenhuma empresa cadastrada com sucesso.
	</c:if>
</body>

</html>