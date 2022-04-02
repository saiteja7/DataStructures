
public class BubbleSort {
	
	public static void main(String[] args) {
		int num[] = {3,5,11,2,4};
		
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					
				}
			}
		}
		for(int s:num) {
			System.out.println(s);
		}
	
	}

}
