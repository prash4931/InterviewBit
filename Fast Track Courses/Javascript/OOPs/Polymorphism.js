class Shape{
    area() {
        // YOUR CODE GOES HERE
        return 0;
        
    }
    print() {
        console.log("This is a shape.");
    }
}

class Square extends Shape{
    constructor(s) {
        super();
        this.s = s;
    }
    area(){
        // YOUR CODE GOES HERE
        return this.s * this.s;
        
    }
}

class Rectangle extends Shape{
    constructor(l, b) {
        super();
        this.l = l;
        this.b = b;
    }

    area() {
       // YOUR CODE GOES HERE 
       return this.l * this.b;
    }
}
