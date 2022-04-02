
public class BinarySearch {
public static void main(String[] args) {
	
	int [] a = {1,2,3,4,5};

	System.out.println(	binarySearch(a, 5));
}

public static int binarySearch(int[] array, int x) {
	
	int left=0;
	int right = array.length-1;
	while(left<=right) {
		int mid = left+((right-left)/2);
		if(array[mid] == x) {
			return mid;
		}else if (x < array[mid]) {
			right=mid-1;
		}
		else {
			left=mid+1;
		}
		
	}

	return -1;
	
}
}
