var MyClass = function (n) {
    this.n = n ;
}

MyClass.X.square = function () {
    return this.n*this.n;
}

var object = new MyClass (4) ;
alert(object.square());