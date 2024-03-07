// Find common Elements between Two Arrays
class FindCommonElements{
	public static void main(String[] args){
		int[] arr1 = {21,54,23,45,32,45,23,45,23,45,23};
		int[] arr2 = {23,42,43,21,34,12,34,21,45,12,43,12,34,12};System.out.println("Our 1st Array:-");
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
					arr2[j]=-1;
					break;
				}
			}
			if((count>0)&&(arr1[i])!=-1)
				System.out.print(arr1[i]+" ");
		}
	}
}