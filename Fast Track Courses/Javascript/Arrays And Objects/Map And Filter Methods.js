// DO NOT USE ARGUMENTS FOR INPUTS
// Vaiable size_ is the size of input array.
// Variable A stores all the array elements
var size_ = parseInt(readLine().trim());
var A = []
for(var i = 0 ; i < size_; i++ ){
    var x = parseInt(readLine().trim());
    A.push(x);
}
// YOUR CODE GOES HERE
var B = []
B = A.map(mutliplyByTwo)
function mutliplyByTwo(num){
    return num * 2;
}

var C = []
C = B.filter(isMultipleOfEight)
function isMultipleOfEight(num) {
    if (num % 8 == 0)
        return num;
}

for (var i = 0; i < C.length; i++) {
    console.log(C[i]);
}
