function fibonacci(num) {
    if (num <= 1)
        return num;
    return fibonacci(num - 1) + fibonacci(num - 2);
}
// tinh tong cua cac  so fibonaci dau tien nho hon inn
var inn = 10;
var arr = [];
var sum1 = 0;
var i = 0;
while (fibonacci(i) < inn) {
    var fi = fibonacci(i);
    arr.push(fi);
    console.log(fi);
    sum1 += fi;
    i++;
}
console.log("Tong = " + sum1);
console.log(arr);
// for (let i = 0; i < inn; i++) {
//
// }
