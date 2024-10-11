let stone = [1, 2, 1, 4] //돌의 내구도
// 독
let dog = [{
    "이름" : "루비독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "4",
},{
    "이름" : "피치독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "3",
},{
    "이름" : "씨-독",
    "나이" : "72년생",
    "점프력" : "2",
    "몸무게" : "1",
},{
    "이름" : "코볼독",
    "나이" : "59년생",
    "점프력" : "1",
    "몸무게" : "1",
},
];

function gotoBridge(stone, dog){
    let answer = [];
    // 개별독, 독
    for(var dog_num of dog){
        let dogPoint = 0; // 독의 위치
        let lose = false;
        // 독의 위치가 내구도보다 작으면
        while (dogPoint<stone.length){
            dogPoint += parseInt(dog_num['점프력'],10); //10진수로
            stone[dogPoint-1] -= parseInt(dog_num['몸무게'], 10);
            if(stone[dogPoint-1] < 0){
                lose = true;
                break;
            }
        }
        if(!lose){
            answer.push(dog_num['이름']);
        }
    }
    return answer;
}

console.log(gotoBridge(stone, dog));