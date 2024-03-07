//Find Duplicate Values String Array
class FindDuplicateString{
	public static void main(String[] args){
		String[] arr = {"mukesh","nameera","mukesh","kumar"};
		System.out.println("Our Array:-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");	
		System.out.println("\nDuplicate Values:-");
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]="$";
				}
			}
			if((count>0)&&(arr[i]!="$"))
				System.out.print(arr[i]+" ");
		}
	}
}