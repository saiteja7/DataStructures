
public class SetBits {
	
	public static void main(String[] args) {
//		to print the number of non set bits for ex 8 and 7 set bits are
//		
//		1000
//		0111
//		1 and 0 are not set similary 0 and 1 so number of non sets are 4
		
		long m=8;
		long p=7;
		int cnt=0;
		for(int i=0;i<63;i++) {
			long bitA = (m>>i)&1;
			long bitB = (p>>i)&1;
			if(bitA!=bitB)cnt++;
		}
		System.out.println(cnt);
	}

}
