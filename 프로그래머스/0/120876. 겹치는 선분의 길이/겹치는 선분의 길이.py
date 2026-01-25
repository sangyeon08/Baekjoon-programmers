def solution(lines):
    dic = {}
    lines = sorted(lines, key = lambda x:x[0])
    
    for x,y in lines:
        while x<y:
            if (x,x+1) not in dic:
                dic[(x, x+1)] = 1
            else :
                dic[(x, x+1)] += 1
            x += 1
    count = 0
    for v in dic.values():
        if v>1:
            count += 1
    return count