
public class UniqueNumberBitManuplation {

	public static void main(String[] args) {
		int[]a = {3,4,6,6,4};
		int ans=0;
		for(int x:a) {
			ans=x^ans;
		}
		System.out.println(ans);
	}
}
