//Find The Smallest and The Second Smallest Element in Array
class SmallAndSecondSmall{
	public static void main(String[] args){
		int[] arr = {92,56,78,56,43,23,45,78,56,23,65,26};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int min=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++)
			if(min>arr[i]){
				smin=min;
				min=arr[i];
			}
		System.out.print("\nSmallest Value : "+min);
		System.out.print("\nSecond Smallest Value : "+smin);
	}
}