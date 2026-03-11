def solution(num, total):
    avg = total // num
    
    start = avg - (num - 1) // 2
    
    return [i for i in range(start, start + num)]