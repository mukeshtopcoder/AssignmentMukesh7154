//Reverse An Array
class ReverseAnArray{
	public static void main(String[] args){
		int[] arr = {64,98,43,62,5,98,72,87};
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nReversed Array");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}