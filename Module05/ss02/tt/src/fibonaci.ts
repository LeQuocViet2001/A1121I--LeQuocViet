function fibonacci(num: number) :number {
    if (num <= 1) return num;

    return fibonacci(num - 1) + fibonacci(num - 2);
}


// tinh tong cua cac  so fibonaci dau tien nho hon inn
let inn : number = 10;
let arr : Array<number> = [];
let sum1 : number = 0;

let i : number = 0;
while ( fibonacci(i) < inn) {
    let fi : number =  fibonacci(i);
    arr.push(fi);
    console.log(  fi);
    sum1 += fi;
    i++;
}

console.log("Tong = " + sum1);
console.log( arr );

// for (let i = 0; i < inn; i++) {
//
// }
