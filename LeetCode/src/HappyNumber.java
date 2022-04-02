
public class HappyNumber {

	public static void main(String[] args) {
		
		
		System.out.println(happNumber(99));

	}
	
	public static boolean happNumber(int n) {
		
		if(n<10) {
			return n==1||n==7;
		}
		
        int sum=0;
		while(n!=0){
			
			int last = n%10;
			sum+=last*last;
			n=n/10;
			
		}
		
			
		
		
		return happNumber(sum);
	}

}
