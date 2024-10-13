// 재귀함수
// 내가 나를 호출하는 함수
// 반복문 <-> 재귀함수

let n = 100;
let s = 0;
for (var i=1; i<n+1; i++){
    s += i;
}
console.log(s);
//O(n)
console.log(n*(n+1)/2);
//O(1)


function plus(n){
    if (n<=1){
        return 1; //종료조건 반드시 필요, 없으면 무한반복
    }
    return n + plus(n-1);
}
console.log(`재귀함수 덧셈 : ${plus(100)}`);


function multi(n){
    if (n<=1){
        return 1; //종료조건 반드시 필요, 없으면 무한반복
    }
    return n * multi(n-1);
}
console.log(`재귀함수 곱셈 : ${multi(5)}`);