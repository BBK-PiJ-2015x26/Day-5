//Recursive method for factorial
int factorial(int n) {
	if (n == 1) {
		return 1
	} else {
		int result = n * factorial(n-1)
		return result
	}
}

println factorial(9)

//Iterative method for factorial
int factorialIt(int n) {
	result = 1
	for (i=1; i <= n; i++) result *= i;
	return result
}

println factorialIt(9)
	