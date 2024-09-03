let num = 5;
function Fact(num) {
    let fact = 1;
    while (num > 0) {
        fact *= num;
    }
    return fact;
}
console.log(Fact(num)); 