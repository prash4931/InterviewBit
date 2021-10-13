// DO NOT USE ARGUMENTS FOR INPUTS
// Input num value is in variable *num*
var Str = readLine().trim();
var patt = readLine().trim();
// YOUR CODE GOES HERE
let pattern = new RegExp(patt,"gi");
console.log(pattern.test(Str));
