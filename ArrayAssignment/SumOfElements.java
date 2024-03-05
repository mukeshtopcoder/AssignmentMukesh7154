// Sum Values of An Array
class SumOfElements{
	public static void main(String[] args){
		int[] arr = {23,65,3,25,23,2};
		int sum=0;
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Sum of Elements
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.print("\nSum of Values : "+sum);
	}
}