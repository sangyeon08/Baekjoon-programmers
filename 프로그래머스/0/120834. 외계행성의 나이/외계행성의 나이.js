function solution(age) {
  const alphabet = "abcdefghij";
  const ageStr = age.toString();
  let result = "";

  for (let i = 0; i < ageStr.length; i++) {
    const digit = parseInt(ageStr[i]);
    result += alphabet[digit];
  }

  return result;
}