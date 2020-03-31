<html>
<body>
	<h2>入力画面</h2>
	<form:form modelAttribute="echoForm">
		<div>テキストを入力をしてください：</div>
		<div>
			<form:input path="text" />
		</div>
		<div>
			<form:button>送信</form:button>
		</div>
	</form:form>
</body>
</html>