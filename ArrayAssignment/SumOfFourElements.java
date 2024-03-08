//Sum of Four Elements is equal to a given number.
import java.util.Scanner;
class SumOfFourElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,7,4,2,6,0,8,1,5,11,15,12,18};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nEnter A Number : ");
		int num = sc.nextInt();
		int flag=1;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					for(int m=k+1;m<arr.length;m++){
						if((arr[i]+arr[j]+arr[k]+arr[m])==num){
							System.out.print("\nFound Combination : "+arr[i]+" + "+arr[j]+" + "+arr[k]+" + "+arr[m]);
						flag=0;
						}
					}
				}
			}
		}
		if(flag==1)
			System.out.print("\nNot Found Any Combination");
	}
}