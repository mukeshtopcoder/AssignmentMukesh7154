// Find Missing Value in Array
import java.util.Scanner;
class FindAValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,5,78,9,54,43,34,56,67,7,67};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter A Number : ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==num){
				System.out.println("Found on Index :"+(i+1));
				flag=1;
			}
		if(flag==0)
			System.out.print("\nValue Not Found In Array!");
	}
}