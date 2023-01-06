class Solution {
    public double solution(int[] numbers) {
    	double answer = 0;
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum = sum + numbers[i];
            answer = (double)sum / (i+1);
        }
        
        System.out.println("수정하였음!!!!!!!");
        
        return answer;
    }
}