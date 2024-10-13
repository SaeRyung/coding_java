// 피보나치 수열
// 1 1 2 3 5 8 13 21
a = 1;
b = 1;
for(var i=0; i<5; i++){
    let c = a + b;
    a = b;
    b = c;
}
console.log(b);

// 재귀함수 활용
function fibonacci(num){
    if(num == 1 || num == 2){
        return 1;
    }
    return fibonacci(num-1) + fibonacci(num-2);
}
console.log(fibonacci(6));