// Count Number of Even And Odd Numbers in An Array
class CountEvenOdd{
	public static void main(String[] args){
		int[] arr = {23,6,43,67,89,67,56,34,34,56,67,78,45};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		System.out.print("\nFound Even Numbers : "+even);
		System.out.print("\nFound Odd Numbers : "+odd);
	}
}