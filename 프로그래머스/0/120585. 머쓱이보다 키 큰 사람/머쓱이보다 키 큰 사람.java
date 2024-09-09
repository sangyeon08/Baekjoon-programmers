class Solution {
    public int solution(int[] array, int height) {
        int add = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] > height){
                add++;
            }
        }
        int answer = add;
        return answer;
    }
}