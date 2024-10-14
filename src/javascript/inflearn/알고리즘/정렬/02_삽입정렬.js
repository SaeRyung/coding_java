// 삽입정렬
let a = [10, 11, 9, 2, 3, 6, 5];
let result = [];
let lenA = a.length;

function addNumIndex(result, addNum){
    for(var i in result){
        if(addNum < result[i]){
            return i;
        }
    }
    return result;
}

for(var i=0; i<lenA; i++){
    let addNum = a.shift() //삽입값, 맨 첫번째 요소 꺼내기
    let indexNum = addNumIndex(result, addNum); //정렬된 배열, 삽입값 넣을 함수
    result.splice(indexNum, 0, addNum);
    console.log(`인덱스 : ${indexNum}`);
    console.log(`정렬된배열 : ${result}`)
}