// Is "else" required?

function checkAge(age) {
	if (age > 18) {
	  return true;
	} else {
	  // ...
	  return confirm('Did parents allow you?');
	}
  }

  function checkAge(age) {
	if (age > 18) {
	  return true;
	}
	// ...
	return confirm('Did parents allow you?');
  } // IT WORKS THE SAME

// Rewrite the function using '?' or '||'

function checkAge(age) {
	return (age > 18) ? true : 'Did parents allow you?';
}

function checkAge(age) {
	return (age > 18) || 'Did parents allow you?';
}

// Function min(a, b)

function min(a, b) {
	return (a < b ? a : b);
}

min(2, 5) == 2
min(3, -1) == -1
min(1, 1) == 1

// Function pow(x,n)

function pow(x,n) {
	return (n > 1 ? x ** n : (n == 0) ? 1 : "invalid");
}

let x = prompt("x");
let n = prompt("n");

pow(x, n);