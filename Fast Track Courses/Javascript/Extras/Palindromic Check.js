// Please take input and print output to standard input/output (stdin/stdout)
// DO NOT USE ARGUMENTS FOR INPUTS
// YOUR CODE GOES HERE

var a = readLine().trim();
var length = Math.floor(a.length/2);
var flag = true;
for (let i = 0; i < length; i++) {
    if (a.charAt(i) == a.charAt(a.length-i-1)) {
        continue;
    } else {
        flag = false;
        break;
    }
}

if(flag) {
    console.log("Yes")
} else {
    console.log("No");
}
