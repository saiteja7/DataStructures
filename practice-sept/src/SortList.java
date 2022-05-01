import java.util.Arrays;
import java.util.Iterator;

public class SortList {
	
	public static void main(String[] args) {
		int [] a = {4,4,3,6,3,7,8,9,9,6,44};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1 ;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		
		
	}

}
