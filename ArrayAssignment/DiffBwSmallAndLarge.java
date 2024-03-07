// Find Difference Between A Smallest And A Largest Value From An Array.
class DiffBwSmallAndLarge{
	public static void main(String[] args){
		int[] arr = {34,6,7,56,43,6,45,5,43,31,45,6,67};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Finding Largest and Smallest Value
		if(arr.length>0){
			int min=arr[0];
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
				if(min>arr[i])
					min=arr[i];
				if(max<arr[i])
					max=arr[i];
			}
			System.out.print("\nDifference Between "+max+" and "+min+" is : "+(max-min));
		}else{
			System.out.print("\nArray is Empty!");
		}
	}
}