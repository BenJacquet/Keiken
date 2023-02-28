// What's the result of OR?

alert( null || 2 || undefined ); // 2 car il trouve la premiere valeur vraie

// What's the result of OR'ed alerts?

alert( alert(1) || 2 || alert(3) ); // 1 2 car il trouve la premier valeur vraie

// What is the result of AND?

alert( 1 && null && 2 ); // null car il trouve la premiere valeur fausse

// What is the result of AND'ed alerts?

alert( alert(1) && alert(2) ); // 1

// The result of OR AND OR

alert( null || 2 && 3 || 4 );

// Check the range between

{
	let age = prompt("Put a number between 14 and 90");
	if ( age >= 14 && age <= 90)
		alert("Cool");
	else
		alert("You're such a rebel");
}

// Check the range outside

{
	let age = prompt("Put a number NOT between 14 and 90");
	if ( !(age >= 14) || age >= 90)
		alert("Cool");
	else
		alert("You're such a rebel");
}

// A question about "if"

if (-1 || 0) alert( 'first' ); // Yes
if (-1 && 0) alert( 'second' ); // No
if (null || -1 && 1) alert( 'third' ); // Yes

// Check the login

let login = prompt("Who's there?");
if (login === "Admin") {
	const password = prompt("Password:");
	if (password === "TheMaster")
		alert("Welcome!");
	else if (password === "" || password === null)
		alert("Canceled");
	else
		alert("Wrong Password");
}
else if (login === "" || login === null)
	alert("Canceled");
else
	alert("I don't know you");