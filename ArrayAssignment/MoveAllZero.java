//Move all 0's Elements At The Last Of The Array.
class MoveAllZero{
	public static void main(String[] args){
		int[] arr = {32,0,0,34,65,0,76,54,0,0,67,76};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Move All Zeros To End
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				for(int j=i;j<arr.length;j++)
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
		}
		System.out.print("\nOur Moved Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}