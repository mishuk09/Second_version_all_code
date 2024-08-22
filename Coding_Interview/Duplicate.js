let arr = [1, 2, 3, 4, 4, 5, 6, 6];
function Duplicate(arr) {
    return [...new Set(arr)];
}
console.log(Duplicate(arr));