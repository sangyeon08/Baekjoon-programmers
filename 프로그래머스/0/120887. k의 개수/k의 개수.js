function solution(i, j, k) {
  let nums = "";
  for (let x = i; x <= j; x++) nums += x;
  return nums.split(k).length - 1; 
}