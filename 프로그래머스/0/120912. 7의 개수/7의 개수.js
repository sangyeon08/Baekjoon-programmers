function solution(array) {
    let answer = 0;
    
    array.forEach((el) => {
        answer += el.toString().split('7').length - 1;
    });
    
    return answer;
}