def solution(myString):
    answer = []

    for string in myString.split("x"):
        answer.append(len(string))

    return answer