function solution(n) {
	let i = 1;
    let mul = 1;
    while (i <= n) {
    	// i가 1일 때부터 순차적으로 값을 곱한다.
        i++;
        mul *= i;
        // mul값이 n보다 커졌을 경우, i-1 값을 리턴한다.
        if (mul > n) return i - 1;
        // mul값이 n과 같을 경우, i값을 리턴한다.
        if (mul === n) return i;
	}
}