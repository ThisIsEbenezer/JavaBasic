import java.util.HashSet;
import java.util.Set;
	
public class SplitString {
	
	


	    public static int solution(String S) {
	        int count = 0;
	        int i = 0;

	        while (i < S.length()) {
	            Set<Character> uniqueChars = new HashSet<>();
	            int j = i;

	            while (j < S.length() && !uniqueChars.contains(S.charAt(j))) {
	                uniqueChars.add(S.charAt(j));
	                j++;
	            }

	            count++;
	            i = j;
	        }

	        return count;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("seeb en ez er"));
	}

}
