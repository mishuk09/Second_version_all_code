let str = 'racecar';
function Palindrome(str) {
    const result = str.split('').reverse().join('');
    return str === result;
}
console.log(Palindrome(str))