//Print Alternative Largest And Smallest Value
import java.util.Arrays;
class LargeAndSmall{
	public static void main(String[] args){
		int[] arr = {54,67,42,5,67,7,65,46,43,23,3,45,56,34};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		Arrays.sort(arr);
		int start=0;
		int end = arr.length-1;
		System.out.print("\nAlternative Array : ");
		while(start<=end){
			if(start!=end){
				System.out.print(arr[end]+" ");
				System.out.print(arr[start]+" ");
			}
			else
				System.out.print(arr[end]+" ");
			end--;
			start++;
		}
	}
}