// Please take input and print output to standard input/output (stdin/stdout)
// DO NOT USE ARGUMENTS FOR INPUTS
// YOUR CODE GOES HERE

var A = parseInt(readLine().trim());

function fibonacci(n) {
    if (n <= 1)
        return n;
    return fibonacci(n-1) + fibonacci(n-2);
}

console.log(fibonacci(A));
