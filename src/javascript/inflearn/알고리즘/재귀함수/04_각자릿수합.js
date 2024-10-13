// 각 자릿수 합
function 문자열역순(문자){
    if(문자.length == 1){
        return parseInt(문자, 10);
    }
    return parseInt(문자[문자.length-1],10) + 문자열역순(문자.slice(0, 문자.length-1))
}
console.log(문자열역순('1231233'));