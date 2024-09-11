class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int sum = 0;
        while(true){
            if(money - 5500 >= 0){
                money -= 5500;
                sum++;
            }else{
                answer[0] = sum;
                answer[1] = money;
                break;
            }
        }
        
        return answer;
    }
}