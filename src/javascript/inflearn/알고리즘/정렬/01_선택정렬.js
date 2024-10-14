// 선택정렬
let a = [10, 11, 9, 2, 3, 6, 5];
let result = [];
let lengthA = a.length;

// pop 뒤에서 빼기
// push 뒤에서 넣기
// shift 앞에서 꺼내기
// unshift 앞에 넣기
for(var i=0; i<lengthA; i++){
    result.push(Math.min.apply(null, a)); //최소값 넣기
    a.splice(a.indexOf(Math.min.apply(null, a)), 1); //넣은 인덱스 빼기
}
console.log(result);