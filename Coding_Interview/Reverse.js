let str = "mahadi ,nus"
function reverseString(str) {
    return str.split("").reverse().join("");
}

console.log(reverseString(str)); // Output: "idaham"



let str1 = 'Mishuk hasan';

function reverseString(str1) {
    let newstr = '';

    for (let i = str1.length - 1; i >= 0; i--) {
        newstr += str1[i];
    }
    return newstr;
}
console.log(reverseString(str1));  
