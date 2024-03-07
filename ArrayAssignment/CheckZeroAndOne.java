// Check An Array Has 0 and -1 in it self.
class CheckZeroAndOne{
	public static void main(String[] args){
		int[] arr = {4,6,0,3,2,2,5,7,0,2,-1,1,3,1,3,5,6,};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Check Zero and Minus Ones
		int flag=0;
		for(int i=0;i<arr.length;i++)
			if((arr[i]==0)||(arr[i]==-1))
				flag=1;
		if(flag==1)
			System.out.print("\nThis Array Has Zeros And Minus Ones");
		else
			System.out.print("\nThis Array Has Not Any Zeros And Minus Ones");
			
	}
}