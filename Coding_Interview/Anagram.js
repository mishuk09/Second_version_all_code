// Anagram this word means that if two string sort form will be same

let str1 = 'listen';
let str2 = 'silent';

function Anagram(str1, str2) {
    let sort1 = str1.split('').sort().join('');
    let sort2 = str2.split('').sort().join('');
    return sort1 === sort2;
}

console.log(Anagram(str1, str2));