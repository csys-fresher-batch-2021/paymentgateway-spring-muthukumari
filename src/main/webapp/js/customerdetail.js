/**
 * This method used to check the user name
 */
var goodColor = "#0f700f";
var badColor = "#a1200a";
function checkUserName() {
	const userName = document.querySelector("#userName").value;
	const MSG = document.getElementById("userNameMsg");
	const button = document.getElementsByTagName("button");
	let url = "UserNameValidationServlet/" + userName;
	axios.get(url).then(res => {
		const result = res.data;
		if (result != null) {
			if (result == false) {
				MSG.style.color = goodColor;
				MSG.innerHTML = "User name available!!!";
				button.disabled = false;
			}
			else {
				MSG.style.color = badColor;
				MSG.innerHTML = "User name already given";
				button.disabled = true;
			}
		}
	});
}

/**
This method check whether the password and conform password are equal or not
 */
function checkPassword() {
	const password = document.querySelector("#password").value;
	const conformPassword = document.querySelector("#conformPassword").value;
	const MSG = document.getElementById("MSG");
	const button = document.querySelector("#button");
	if (password == conformPassword) {
		MSG.style.color = goodColor;
		MSG.innerHTML = "Password Matched!!!";
		button.disabled = false;
	}
	else {
		MSG.style.color = badColor;
		MSG.innerHTML = "Password Doesn't Match";
		button.disabled = true;
	}
}

/**
*This method used to pass the user registration details
*/
function register() {
	event.preventDefault();
	let phoneNo = document.querySelector("#phone").value;
	let firstName = document.querySelector("#firstName").value;
	let lastName = document.querySelector("#lastName").value;
	let email = document.querySelector("#email").value;
	let userName = document.querySelector("#userName").value;
	let password = document.querySelector("#password").value;
	let data = {
		"mobileNo": phoneNo,
		"firstName": firstName,
		"lastName": lastName,
		"email": email,
		"userName": userName,
		"password": password
	};
	let url = "RegistrationServlet";
	console.log("muthu");
	axios.post(url, data).then(res => {
		console.log("hi");
		let data = res.data;
		console.log(data.infoMessage);
		alert(data.infoMessage);
		window.location.href = "index.jsp";
	}).catch(err => {
		console.log("hello");
		let data = err.response.data;
		console.log(data.errorMessage);
		alert(data.errorMessage);
	});
}