function solution(order) {
    let answer = 0;
    let str = String(order);

    for (let j of str) {
        if (j === "3" || j === "6" || j === "9") {
            answer++;
        }
    }
    return answer;
}
