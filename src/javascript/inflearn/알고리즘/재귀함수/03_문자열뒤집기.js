let result = '';
let x = 'kuromi';
while (true){
    if(x.length == 1){
        result += x;
        break;
    }
    let y = x.split('');
    result += String(y.pop());
    x = y.join('');
}
// console.log(result.split('').reverse().join(''));
console.log(result);

//재귀함수로 표현
console.log('재귀함수로 표현')
function 문자열역순(x){
    if (x.length == 1){
        return x;
    }
    return x[x.length-1] + 문자열역순(x.slice(0, x.length-1))
}
console.log(문자열역순('kuromi'));