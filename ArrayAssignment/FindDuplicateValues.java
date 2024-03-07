//Find Duplicate Values in Array
class FindDuplicateValues{
	public static void main(String[] args){
		int[] arr = {32,54,78,43,67,34,32,54,56,34,23,45,56};
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");	
		System.out.println("\nDuplicate Values");
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]=-1;
				}
			}
			if((count>0)&&(arr[i]!=-1))
				System.out.print(arr[i]+" ");
		}
	}
}