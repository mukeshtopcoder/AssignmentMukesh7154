//Remove Duplicate Elements And Return New Array Length
class RemoveDuplicateElements{
	public static void main(String[] args){
		int[] arr = {23,56,34,23,45,56,56,45,34,32,34,45,45};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Removing Duplicate Values
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					arr[j]=-1;
			}
		}
		int count=0;
		System.out.print("\nDuplicate Removed Array : ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=-1){
				count++;
				System.out.print(arr[i]+" ");
			}
		System.out.print("\nNew Length of Array : "+count);
	}
}