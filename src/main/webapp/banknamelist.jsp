<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style2.css">
<title>Bank List</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3 class="h2">LIST OF BANKS</h3>
		<br />
		<div class="table-wrapper">
			<table class="fl-table">
				<caption>List of Banks</caption>
				<thead>
					<tr>
						<th scope="col">SNO.</th>
						<th scope="col">BANK NAME</th>
					</tr>
				<tbody id="bank-table">
				</tbody>
			</table>
		</div>
	</main>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"
		integrity="sha512-bZS47S7sPOxkjU/4Bt0zrhEtWx0y0CRkhEp8IckzK+ltifIIE9EMIMTuT/mEzoIMewUINruDBIR/jJnbguonqQ=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script src="js/bankdetail.js">	</script>
</body>
</html>