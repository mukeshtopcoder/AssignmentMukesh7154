//Find Second Smallest Elements of An Array
class FindSecondSmallest{
	public static void main(String[] args){
		int[] arr = {63,65,32,29,46,43,72,34,56,43,56};
		System.out.print("Our Array Elements :-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int smallest=arr[0];
		int ssmallest=arr[0];
		for(int i=0;i<arr.length;i++)
			if(ssmallest>arr[i]){
				if(arr[i]>smallest)
					ssmallest=arr[i];
				else
				{
					ssmallest=smallest;
					smallest=arr[i];
				}
			}
		System.out.print("\nSecond Largest Element : "+ssmallest);
	}
}