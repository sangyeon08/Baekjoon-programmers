function solution(intStrs, k, s, l) {
    var answer = [];
    
    for (let str of intStrs) {

        let subStr = str.slice(s, s + l);
        
        let num = Number(subStr);

        if (num > k) {
            answer.push(num);
        }
    }
    
    return answer;
}