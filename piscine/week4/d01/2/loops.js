// Last loop value

{
	let i = 3;

	while (i) {
	  alert( i-- );
	} // 1
}

// Which values does the while loop show?

{
	let i = 0;
	while (++i < 5)
		alert( i ); // 1,2,3,4
}

{
	let i = 0;
	while (i++ < 5)
		alert( i ); // 1,2,3,4,5
}

// Which values get shown by the "for" loop?

{
	for (let i = 0; i < 5; i++) alert( i ); // 0,1,2,3,4
}

{
	for (let i = 0; i < 5; ++i) alert( i ); // 0,1,2,3,4
}

// Output even numbers in the loop

{
	for (let i = 2; i <= 10; i++)
		if (i % 2 === 0) alert(i);
}

// Replace "for" with "while"

{
	let i = 2;
	while (i <= 10) {
		if (i % 2 === 0) alert(i);
		i++;
	}
}

// Repeat until the input is correct
{
	while (1) {
		let number = prompt("Input a number greater than 100");
		if (parseInt(number) > 100 || number === "" || number === null)
			break;
	}
}

// Output prime numbers

{
	let limit = parseInt(prompt("Until which number do you want to print primes?"));
	if (limit > 1){
		for (let n = 2 ; n <= limit; n++) {
			let notPrime = false;
			for (let divider = 2; divider < n; divider++) {
				if (n % divider == 0)
					notPrime = true;
				}
			if (n > 1 && notPrime == false)
			console.log(n);
		}
	}
}