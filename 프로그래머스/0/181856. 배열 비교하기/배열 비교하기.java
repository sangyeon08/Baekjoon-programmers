class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int length1 = arr1.length;
        int length2 = arr2.length;
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        
        for( int i = 0; i < length1; i++){
            num1 += arr1[i];
        }
        for( int i = 0; i < length2; i++){
            num2 += arr2[i];
        }
        
        if( length1 > length2){
            answer = 1;
        }else if(length1 < length2){
            answer = -1;
        }else if(length1 == length2){
            if(num1 > num2){
                answer = 1;
            }else if( num1 < num2){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        
        

        return answer;
    }
}