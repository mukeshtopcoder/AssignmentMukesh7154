// Find common Elements between Two Arrays
class FindCommonString{
	public static void main(String[] args){
		String[] arr1 = {"rahul","raju","ram","raman","raj"};
		String[] arr2 = {"rahul","ramu","ram","ramu","rajan"};
		System.out.println("Our 1st Array:-");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");	
		System.out.println("\nOur 2nd Array:-");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.println("\nCommon Elements From Both Array:-");
		for(int i=0;i<arr1.length;i++){
			int count=0;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					count++;
					arr2[j]="$";
					break;
				}
			}
			if((count>0)&&(arr1[i])!="$")
				System.out.print(arr1[i]+" ");
		}
	}
}