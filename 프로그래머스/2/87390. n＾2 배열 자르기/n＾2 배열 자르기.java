class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1);
        int[] answer = new int[length];
        
        int idx = 0;
        
        for (long i = left; i <= right; i++) {
            long row = i / n + 1; // 그냥 외워..
            long col = i % n + 1; // 그냥 외워..
            answer[idx++] = (int) Math.max(row, col);
        }
        
        
        return answer;
    }
}