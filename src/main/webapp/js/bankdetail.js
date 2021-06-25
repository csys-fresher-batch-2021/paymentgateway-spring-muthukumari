/**
 * This method used to get the bank name list
 */
function getBankNameList() {
	let url = "BankNameListServlet";
	fetch(url).then(res => res.json()).then(res => {
		console.log(res);
		let bankNames = res;
		let serial = 1;
		let content = "";
		for (let bankNameList of bankNames) {
			content += "<tr><td>" + serial + "</td>"
				+ "<td>" + bankNameList + "</td></tr>"

			serial += 1;
		}
		document.querySelector("#bank-table").innerHTML = content;
	});
}
getBankNameList();