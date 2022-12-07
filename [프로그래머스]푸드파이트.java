class Solution {
    public String solution(int[] food) {
        String answer = ""; // 물은 항상 존재
    
        StringBuilder sb = new StringBuilder(""); 
        for(int i = food.length-1; i > 0 ; i--) {
            
            for(int j = 0; j < (food[i] / 2); j++) {
                sb.append(i);
            }
        }
        
        answer = sb.reverse().toString() + "0" + sb.reverse().toString();
        
        return answer;
    }
}
