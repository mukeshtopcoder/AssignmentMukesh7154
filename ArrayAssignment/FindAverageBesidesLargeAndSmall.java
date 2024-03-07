//Find Average of All Elements
class FindAverageBesidesLargeAndSmall{
	public static void main(String[] args){
		int[] arr = {83,45,67,56,45,24,34,45,45,56,6,67,77};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Find Largest And Smalles Value
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		// Finding Average Besides Smallest And Largest Value
		int num=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
			if((arr[i]!=max)&&(arr[i]!=min))
				{
					sum=sum+arr[i];
					num++;
				}
		int average = sum/num;
		System.out.print("\nSmallest Value : "+min+"\nLargest Value : "+max);
		System.out.print("\nAverage Excludes Smallest And Largest Value is : "+average);
	}
}