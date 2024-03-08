//Seprate All Zeros and Ones
import java.util.Arrays;
class SeprateZeroAndOne{
	public static void main(String[] args){
		int[] arr = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		Arrays.sort(arr);
		System.out.print("\nOur Sorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}