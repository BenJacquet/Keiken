// Postfix and prefix form

{
	let a = 1, b = 1;

	let c = ++a; // 2
	let d = b++; // 1
}

// Assignment result

{
	let a = 2;

	let x = 1 + (a *= 2); // 5
}

// Type conversions

{
	"" + 1 + 0 // "10"
	"" - 1 + 0 // -1
	true + false // true
	6 / "3" // 2
	"2" * "3" // 6
	4 + 5 + "px" // "9px"
	"$" + 4 + 5 // "$45"
	"4" - 2	// 2
	"4px" - 2 // NaN
	"  -9  " + 5 // "  -9  5"
	"  -9  " - 5 // -14
	null + 1 // 1
	undefined + 1 // NaN
	" \t \n" - 2 // -2
}

// Rule of thumb = + is for concatenation to strings, - casts to numbers then does the operation

// Fix the addition
{
	let a = parseInt(prompt("First number?", 1));
	let b = parseInt(prompt("Second number?", 2));

	alert(a + b);
}