let data = ['   + -- + - + -   ',
    '   + --- + - +   ',
    '   + -- + - + -   ',
    '   + - + - + - +   '];

let result = '';

for(var s of data){
    console.log((s.replace(/ /g, '').replace(/\+/g, 1).replace(/-/g, 0)));
    console.log(Number(s.replace(/ /g, '').replace(/\+/g, 1).replace(/-/g, 0)));
    console.log(parseInt(s.replace(/ /g, '').replace(/\+/g, 1).replace(/-/g, 0),2));
    result += String.fromCharCode(parseInt(s.replace(/ /g, '').replace(/\+/g, 1).replace(/-/g, 0),2));
}

console.log(result);

// 넘버로 출력
// for(var s in data){
//     console.log(s);
// }