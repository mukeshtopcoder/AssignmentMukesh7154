//Find Second Largest Elements of An Array
class FindSecondLargest{
	public static void main(String[] args){
		int[] arr = {23,65,32,21,46,43,72,34,56,43,56};
		System.out.print("Our Array Elements :-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int largest=arr[0];
		int slargest=arr[0];
		for(int i=0;i<arr.length;i++)
			if(slargest<arr[i]){
				if(arr[i]<largest)
					slargest=arr[i];
				else
				{
					slargest=largest;
					largest=arr[i];
				}
			}
		System.out.print("\nSecond Largest Element : "+slargest);
	}
}