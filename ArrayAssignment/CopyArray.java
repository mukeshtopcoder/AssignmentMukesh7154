//Write A Java Program To Copy An Array By Iterating The Array
class CopyArray{
	public static void main(String[] args){
		int[] arr = {23,45,12,45,56,43,23,43};
		int[] arr2 = new int[arr.length];
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++)
			arr2[i]=arr[i];
		System.out.println("\nCopied..");
		System.out.print("Copied Array : ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
	}
}