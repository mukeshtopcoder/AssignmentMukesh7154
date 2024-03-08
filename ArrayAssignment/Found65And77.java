//Found 65 and 77 in Array
class Found65And77{
	public static void main(String[] args){
		int[] arr = {23,56,78,54,24,86,65,45,67,56,34,56,77};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Lets Find 65 Here
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==65){
			System.out.print("\nFound : "+arr[i]);
			count++;
			break;
			}
		for(int i=0;i<arr.length;i++)
			if(arr[i]==77){
			System.out.print("\nFound : "+arr[i]);
			count++;
			break;
			}
		if(count==2)
			System.out.print("\nFound Both Elements!");
	}
}