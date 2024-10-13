// 재귀함수 사례-1. 이진수 변환

// Math.ceil() : 소수점 올림
// Math.floor() : 소수점 버림
// Math.round() : 소수점 반올림

let x = 11;

let result = '';
while(true){
    if(x%2 == 0){
        result = '0' + result;
    }else{
        result = '1' + result;
    }
    x = Math.floor(x/2);
    //종료조건
    if(x == 1 || x == 0){
        result = String(x) + result;
        break;
    }
}
console.log(result);
//console.log(result.split('').reverse().join('')); 결과물에서 뒤집을때


// 재귀함수로 표현
function 이진법(숫자){
    if (숫자 == 1 || 숫자 == 0){
        return String(숫자)
    }
    return 이진법(Math.floor(숫자/2)) + String(숫자%2);
}
console.log(이진법(11));