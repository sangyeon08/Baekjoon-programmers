function solution(box, n) {
    let answer = [];
    
    for (let i of box) {
        answer.push(Math.floor(i / n));
    }
    
    return answer.reduce((a, b) => a * b, 1);
}