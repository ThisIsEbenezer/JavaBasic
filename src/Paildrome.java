
public class Paildrome {
	
	
	    public static String solution(int N, int K) {
	        // Implement your solution here
	        if(N < K || K > 26) {
	            return "";
	        }

	        char[] palindrome = new char[N];
	        int i = 0;
	        int j = N - 1;
	        
	        for(int index=0; index < N;index++) {
	            palindrome[index] = 'a';
	        }

	        for(char ch = 'a';K > 0 && i<=j;ch++,K--) {
	            palindrome[i] =ch;
	            if(i != j) {
	                palindrome[j] = ch;
	            }

	            i++;
	            j--;
	        }

	        return new String(palindrome);
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(solution(10,4));
		}
	


}
