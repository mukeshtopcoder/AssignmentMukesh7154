//Find Maximum and Minimum Value of An Array!
class FindMaxAndMin{
	public static void main(String[] args){
		int[] arr = {23,45,56,67,7,78,7,65,54,43,45,56,54,67,34};
		System.out.println("Our Array ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.print("\nMaximum Value : "+max);
		System.out.print("\nMinimum Value : "+min);
	}
}