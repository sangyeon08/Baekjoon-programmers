function solution(n) {
  var answer = 0;

  for (let i = 1; i <= n; i++) {
    let sum = 0;
    for (let j = 1; j <= i; j++) {
      if (i % j === 0) {
        sum += 1;
      }
    }
    if (sum >= 3) {
      answer += 1;
    }
  }

  return answer;
}