// worst - O(nlog2n), best-O(n**2)
let arrA = [10, 11, 9, 2, 3, 6, 5];

function quickSort(arrA){
    let arrAlength = arrA.length;

    if(arrAlength <= 1){
        return arrA;
    }

    let point = [arrA.shift()];
    let groupA = [];
    let groupB = [];

    for(let i in arrA){
        if(arrA[i] < point){
            groupA.push(arrA[i])
        }else{
            groupB.push(arrA[i]);
        }
    }
    console.log(`groupA : ${groupA}\n groupB : ${groupB}\n point : ${point}`);
    return quickSort(groupA).concat(point, quickSort(groupB));
}

console.log(quickSort(arrA));