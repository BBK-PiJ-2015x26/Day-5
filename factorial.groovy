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