//Insert An Element on A Specific Position
import java.util.Scanner;
class InsertAnElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = {34,56,34,65,4,67,34,56,22,13,43,4,};
		System.out.println("Our Array ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\n	Enter Element To Enter : ");
		int num = sc.nextInt();
		System.out.print("Enter Index Where To Enter : ");
		int index = sc.nextInt();
		if(index>arr.length)
			System.out.print("Index is not Present in Array!");
		else{
			arr[index]=num;
			System.out.println("Number Inserted!");
		}
		System.out.println("\nNew Array ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}