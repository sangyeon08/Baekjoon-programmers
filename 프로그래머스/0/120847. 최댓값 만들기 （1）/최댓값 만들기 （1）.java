import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int Max1 = numbers[numbers.length-1];
        int Max2 = numbers[numbers.length-2];
        
        answer = Max1 * Max2;
        return answer;
    }
}