//Remove Specific Value in Array
import java.util.Scanner;
class RemoveSpecificValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,56,43,21,46,67,34};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter Number You Want To Remove : ");
		int num = sc.nextInt();
		System.out.print("Number Deleted From Array : ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=num)
				System.out.print(arr[i]+" ");
	}
}