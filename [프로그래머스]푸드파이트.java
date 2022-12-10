class Solution {
    public String solution(int[] food) {
        String answer = ""; // 물은 항상 존재
    
        StringBuilder sb = new StringBuilder(""); 
        for(int i = 0; i < food.length ; i++) {
            
            for(int j = 0; j < (food[i] / 2); j++) {
                sb.append(i);
            }
        }
        
        answer = sb.toString() + "0" + sb.reverse().toString();
        
        return answer;
    }
}
