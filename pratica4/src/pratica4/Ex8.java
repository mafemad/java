package pratica4;

public class Ex8 {

	public static void main(String[] args) {
		int m[] = {1,2,3,4,5,6,7,8,9,10};
		int n[] = {1,1,1,1,1,1,1,1,1,1};
		int result = 0;
		
		
		for (int i = 0; i < n.length; i++) {
			result += m[i] * n[i]; 
		}

		System.out.println(result);
	}

}
