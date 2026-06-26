function solution(my_string, queries) {
    let arr = my_string.split('');
        queries.forEach(([s, e]) => {
        let target = arr.slice(s, e + 1).reverse();
        
        arr.splice(s, target.length, ...target);
    });
    
    return arr.join('');
}