function solution(my_string, indices) {
    const indexSet = new Set(indices);
    
    return [...my_string]
        .filter((_, index) => !indexSet.has(index))
        .join('');
}