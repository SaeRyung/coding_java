//O(nlogn)
let arrA = [10, 11, 9, 2, 3, 6, 5];

function plusSort(arrA){
    let result = [];

    let arrAlenght = arrA.length;
    if(arrAlenght <= 1){
        return arrA;
    }
    let middle = parseInt(arrAlenght/2);
    let groupA = plusSort(arrA.slice(0, middle));
    let groupB = plusSort(arrA.slice(middle, ));

    while(groupA.length != 0 && groupB.length != 0){
        if(groupA[0] < groupB[0]){
            result.push(groupA.shift());
        }else{
            result.push(groupB.shift());
        }
    }
    while(groupA.length != 0){
        result.push(groupA.shift());
    }
    while (groupB.length != 0){
        result.push(groupB.shift());
    }


    return result;
}

console.log(plusSort(arrA));