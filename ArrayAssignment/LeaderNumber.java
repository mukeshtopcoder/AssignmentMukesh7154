// Print All Leader Numbers
class LeaderNumber{
	public static void main(String[] args){
		int[] arr = {32,45,67,94,43,23,45,56,67,65,45};
		System.out.print("Our Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// Find Leader Number
		for(int i=0;i<arr.length;i++)
		{
			int flag=1;
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j])
					flag=0;
			if(flag==1)
			  System.out.print("\nFound Leader Number : "+arr[i]);
		}
	}
}