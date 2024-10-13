let a = [10, 20, 30, 1, 2, 3, 5, 9, 11];

a.sort()
console.log(a[0]); //1
console.log(a[a.length-1]); //9
//사전식 정렬로 인해 똑같은 형태로 정렬을 한다.
console.log(a);

// let maxx = Math.max(a); //NaN
// let minn = Math.min(a); //NaN

let maxx = Math.max.apply(null, a);
let minn = Math.min.apply(null, a);


console.log(maxx);
console.log(minn);

let m = a[0];
for(var num of a){
    if(num<m){ //부등호 바꿔주면 최대, 최소 구한다.
        m = num;
    }
}
console.log(m);