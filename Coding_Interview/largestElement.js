// let arr = [1, 2, 3, 4, 5, 6, 9];

// function Largest(arr) {
//     let largest = arr[0]
//     for (let i = 1; i < arr.length; i++) {
//         if (arr[0] < arr[i]) {
//             largest = arr[i];
//         }
//     }
//     return largest

// }

// console.log(Largest(arr));


let arr = [1, 2, 3, 9, 9, 4, 5, 6];

function Largest(arr) {
    arr.sort();
    return arr[arr.length - 1];


}

console.log(Largest(arr));