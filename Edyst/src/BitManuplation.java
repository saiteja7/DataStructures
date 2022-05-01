import java.util.ArrayList;

public class BitManuplation {

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = {2,4,6,8};
		for(int i=0;i<a.length;i++) {
			list.add(countBits(a[i]));
		}
		System.out.println(list);
	}
	
	public static int countBits(int n) {
		int cnt =0;
		for(int i=28;i>=0;--i) {
		if(((n>>i)&1)==1) {
			cnt++;
		};
		}
		return cnt;
	}
	
}
