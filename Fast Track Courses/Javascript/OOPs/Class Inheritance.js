class A{
    constructor(x, y){
        this.x = x;
        this.y = y;
    }   
}

let x = readLine();
let y = readLine();
let z = readLine();

//ToDo
class B extends A {
    constructor(x,y,z) {
        super(x,y);
        this.z = z;
    }
    printIB() {
        console.log("IB");
    }
}
