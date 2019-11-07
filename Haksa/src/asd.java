import java.util.StringTokenizer;

public class asd {

	public static void main(String[] args) {
	String query = "   asd";
	StringTokenizer st = new StringTokenizer(query, " ");
	int n = st.countTokens();
	System.out.println(n);
	for(int i = 0 ; i<n ; i++) {
		String token = st.nextToken();
		System.out.println(token);
	}
	}
}