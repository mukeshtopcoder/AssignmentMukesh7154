//Find Length of Consecutive Elements From An Array
import java.util.Arrays;
class FindLengthOfConsecutive{
	public static void main(String[] args){
		int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//Finding Length of Consective Numbers
		int len=0;
		for(int i=0;i<arr.length;i++){
			int count=1;
			int num=arr[i];
			for(int j=0;j<arr.length;j++){
				if((num+1)==arr[j]){
					count++;
					num=arr[j];
					j=0;
				}
			}
			if(count>len)
				len=count;
		}
		System.out.print("\nLength Of Consecutive Elements is : "+len);
	}
}