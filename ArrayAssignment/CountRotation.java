//Count Rotation Of An Array With An Actual Array
import java.util.Arrays;
class CountRotation{
	public static void main(String[] args){
		int[] arr1 = {12,34,5,67,8,90,43,67};
		int[] arr2 = {43,67,12,34,5,67,8,90};
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[0]==arr2[i])
				break;
			count++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)){
			System.out.print("\nRotation is : "+count);
		}else{
			System.out.print("\nArrays Are Different!");
		}
	}
}