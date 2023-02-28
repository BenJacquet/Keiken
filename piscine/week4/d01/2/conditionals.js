// if

if ("0") {
	alert( 'Hello' ); // It will be displayed
}

// The name of Javascript
let answer = prompt("What if the \"official\" name of Javascript?", "ECMAScript");
if (answer === "ECMAScript") {
	alert("Right!");
}
else {
	alert("You don't know? ECMAScript!");
}

// Show the sign
let number = prompt("Enter a number", );
if (number > 0) {
	alert(1);
}
else if (number < 0) {
	alert(-1);
}
else {
	alert(0);
}

// Rewrite 'if' into '?'

let result;

result = (a + b < 4) ? 'Below' : 'Over';

// Rewrite 'if..else' into '?'

let login = prompt("Who are you ?");
let message;

message = (login == 'Employee') ? 'Hello' :
			(login == 'Director') ? 'Greetings' :
			(login == '') ? "No login" :
			"";

alert(message);