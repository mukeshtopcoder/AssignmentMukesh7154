// Move All Positive Number Before All Negative Number
class MovePositiveNumber{
	public static void main(String[] args){
		int[] arr = {23,-6,34,-67,-34,-56,73,-23,54};
		System.out.print("\nInteger Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.print("\nSorter Integer Array : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}