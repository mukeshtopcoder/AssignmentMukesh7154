//Find Index of a Value In Array
import java.util.Scanner;
class FindIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,45,67,87,65,34,24};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter Number To Find : ");
		int key = sc.nextInt();
		int flag=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				System.out.print("Found On Position "+i);
				flag=0;
			}
		}
		if(flag==1)
			System.out.print("Not Found in Array!");
	}
}