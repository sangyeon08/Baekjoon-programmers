class Solution {
    public int solution(int[] array, int n) {
        int add = 0;
        
        for(int a : array){
            if(a == n){
                add++;
            }
        }
        
        int answer = add;
        return answer;
    }
}