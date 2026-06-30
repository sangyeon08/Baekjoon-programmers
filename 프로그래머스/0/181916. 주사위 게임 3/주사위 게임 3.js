function solution(a, b, c, d) {
    const dice = [a, b, c, d];
    

    const counts = new Map();
    for (const num of dice) {
        counts.set(num, (counts.get(num) || 0) + 1);
    }

    const sortedCounts = [...counts.entries()].sort((a, b) => b[1] - a[1]);
    
    if (sortedCounts.length === 1) {
        const p = sortedCounts[0][0];
        return 1111 * p;
    }
    

    if (sortedCounts.length === 2) {
        const [p, pCount] = sortedCounts[0];
        const [q, qCount] = sortedCounts[1];
        

        if (pCount === 3) {
            return Math.pow(10 * p + q, 2);
        }

        if (pCount === 2) {
            return (p + q) * Math.abs(p - q);
        }
    }
    
    if (sortedCounts.length === 3) {

        const q = sortedCounts[1][0];
        const r = sortedCounts[2][0];
        return q * r;
    }
    
    if (sortedCounts.length === 4) {
        return Math.min(...dice);
    }
}