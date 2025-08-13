function solution(rsp) {
    let answer = [];
    
    for(let i of rsp) {
        if(i == '2') {
            answer.push('0');
        } else if(i == '0') {
            answer.push('5');
        } else {
            answer.push('2');
        }
    }
    return answer.join('');
}