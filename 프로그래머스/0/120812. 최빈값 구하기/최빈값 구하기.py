from collections import Counter

def solution(array):
    a = Counter(array).most_common(2)
    return -1 if len(a) > 1 and a[0][1] == a[1][1] else a[0][0]
