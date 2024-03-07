//Print All Pairs Of an array whose sum is equal to a specific number.
import java.util.Scanner;
class PrintPair{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,8,1,3,2,5,7,9,6,4};
		System.out.println("Our Array:-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter A Number : ");
		int num = sc.nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++)
				if(num==(arr[i]+arr[j]))
					System.out.println(arr[i]+" + "+arr[j]+" = "+num);
		}
	}
}