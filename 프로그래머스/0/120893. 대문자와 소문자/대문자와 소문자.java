class Solution {
    public String solution(String my_string) {
        String answer = "";
        char a;
        
        for(int i=0; i<my_string.length(); i++){
            a = my_string.charAt(i);
            
            if(Character.isUpperCase(a)){
                answer += Character.toLowerCase(a);
            } else {
                answer += Character.toUpperCase(a);
            }
        }

        return answer;
    }
}