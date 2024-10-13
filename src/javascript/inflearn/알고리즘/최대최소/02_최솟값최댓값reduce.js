// 최댓값 최솟값 reduce
// 삼항연산자
let a = [6, 5, 4, 3, 2];
const reduceOne = (accumulator, currentvalue) => accumulator + currentvalue;
const reduceTwo = (accumulator, currentvalue) => accumulator - currentvalue;
const reducerThree = (accumulator, currentvalue) => accumulator > currentvalue ? accumulator : currentvalue;
const reducerFour = (accumulator, currentvalue) => accumulator < currentvalue ? accumulator : currentvalue;
console.log(a.reduce(reduceOne));
console.log(a.reduce(reduceTwo));
console.log(a.reduce(reducerThree));
console.log(a.reduce(reducerFour));
