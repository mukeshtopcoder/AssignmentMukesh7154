// Remove Duplicate Values In Array
class RemoveDuplicateValue{
	public static void main(String[] args){
		int[] arr = {2,5,3,5,7,5,4,3,6,4,6,4,3,2,3};
		int[] arr2 = new int[arr.length];
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					arr[j]=-1;
			}
		}
		System.out.print("\nRemoved Duplicate Array : ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=-1)
				System.out.print(arr[i]+" ");
	}
}